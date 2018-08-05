package win.sz90.graph;

import java.util.LinkedList;

public class Graph1 {
    private static final int MAX_WEIGHT = 1000;
    private static int vertexSize = 9;
    private static int[][] matrix = new int[vertexSize][vertexSize];
    private static boolean[] vertexs = new boolean[vertexSize];
    public static void main(String[] args) {
        int[] a0 = new int[]{0,10,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,11,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT};
        int[] a1= new int[]{10,0,18,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,MAX_WEIGHT,12};
        int[] a2= new int[]{MAX_WEIGHT,MAX_WEIGHT,0,22,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,MAX_WEIGHT,12};
        int[] a3= new int[]{MAX_WEIGHT,MAX_WEIGHT,22,0,20,MAX_WEIGHT,MAX_WEIGHT,16,21};
        int[] a4= new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,20,0,26,MAX_WEIGHT,7,MAX_WEIGHT};
        int[] a5= new int[]{11,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,26,0,17,MAX_WEIGHT,MAX_WEIGHT};
        int[] a6= new int[]{MAX_WEIGHT,16,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,17,0,19,MAX_WEIGHT};
        int[] a7= new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,7,MAX_WEIGHT,19,0,MAX_WEIGHT};
        int[] a8= new int[]{MAX_WEIGHT,12,8,21,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};
        matrix[0] = a0;
        matrix[1] = a1;
        matrix[2] = a2;
        matrix[3] = a3;
        matrix[4] = a4;
        matrix[5] = a5;
        matrix[6] = a6;
        matrix[7] = a7;
        matrix[8] = a8;
        //dfs();
        bfs();
    }

    private static void dfs(){
        for(int i = 0;i <vertexSize;i++){
            if(!vertexs[i]){
                System.out.println(i);
                vertexs[i] = true;
                dfs(i);
            }
        }
    }

    private static void dfs(int i) {
        vertexs[i] = true;
        int w = getFirstNeighbor(i);
        while(w != -1){
            if(!vertexs[w]){
                System.out.println(w);
                dfs(w);
            }
            w = getNextNeighbor(i,w);
        }
    }

    public static void bfs(){
        for(int i = 0;i <vertexSize;i++){
            if(!vertexs[i]){
                vertexs[i] = true;
                bfs(i);
            }
        }
    }

    private static void bfs(int i) {
        int u,w;
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println(i);
        vertexs[i] = true;
        queue.add(i);
        while(!queue.isEmpty()){
            u = (queue.removeFirst()).intValue();
            w = getFirstNeighbor(u);
            while(w != -1){
                if(!vertexs[w]){
                    System.out.println(w);
                    vertexs[w] = true;
                    queue.add(w);
                }
                w = getNextNeighbor(u,w);
            }
        }
    }


    private static int getFirstNeighbor(int index){
        for(int i=0;i<vertexSize;i++){
            if(matrix[index][i] != MAX_WEIGHT && matrix[index][i] != 0){
                return i;
            }

        }
        return -1;
    }

    private static int getNextNeighbor(int v,int index){
        for(int i=index+1;i<vertexSize;i++){
            if(matrix[v][i] != MAX_WEIGHT && matrix[v][i] != 0){
                return i;
            }
        }
        return -1;
    }

}
