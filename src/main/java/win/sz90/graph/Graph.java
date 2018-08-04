package win.sz90.graph;

public class Graph {
    private int vertexSize;//顶点数量
    private int[] vertexs;//定点数组
    private int[][] matrix;
    private static final int MAX_WEIGHT = 1000;
    private boolean[] isVisted;

    public Graph(int vertexSize){
        this.vertexSize = vertexSize;
        this.matrix = new int[vertexSize][vertexSize];
        vertexs = new int[vertexSize];
        for(int i=0;i<5;i++){
            vertexs[i] = i;
        }
        isVisted = new boolean[vertexSize];
    }

    public int[] getVertexs() {
        return vertexs;
    }

    public void setVertexs(int[] vertexs) {
        this.vertexs = vertexs;
    }

    public int getOutDegree(int index){
        int count = 0;
        for(int i=0;i<vertexSize;i++){
             if(matrix[index][i]!=0 && matrix[index][i]!=MAX_WEIGHT){
                 count++;
             }
         }
         return count;
    }

    public int getFirstNeighbor(int index){
        for(int i=0;i<vertexSize;i++){
            if(matrix[index][i] != MAX_WEIGHT && matrix[index][i] != 0){
                return i;
            }

        }
        return -1;
    }

    public int getNextNeighbor(int v,int index){
        for(int i=index+1;i<vertexSize;i++){
            if(matrix[v][i] != MAX_WEIGHT && matrix[v][i] != 0){
                return i;
            }
        }
        return -1;
    }

    private void depthFirstSearch(int i){
        isVisted[i] = true;
        int w = getFirstNeighbor(i);
        while(w!=-1){
            if(!isVisted[w]){
                System.out.println("访问到了："+w+"顶点");
                depthFirstSearch(w);
            }
            w = getNextNeighbor(i,w);//第一个相对于w的邻接节点
        }
    }

    /**
     * 对外公开的深度优先遍历
     * */
    public void depthFirstSearch(){
        isVisted = new boolean[vertexSize];
        for(int i=0;i<vertexSize;i++){
            if(!isVisted[i]){
                System.out.println("访问到了："+i+"顶点");
                depthFirstSearch(i);
            }
        }
        isVisted = new boolean[vertexSize];
    }


    public static void main(String[] args) {
        Graph graph = new Graph(5);
        int[] a1 = new int[]{0,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,6};
        int[] a2 = new int[]{9,0,3,MAX_WEIGHT,MAX_WEIGHT};
        int[] a3 = new int[]{2,MAX_WEIGHT,0,5,MAX_WEIGHT};
        int[] a4 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0,1};
        int[] a5 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};
        graph.matrix[0] = a1;
        graph.matrix[1] = a2;
        graph.matrix[2] = a3;
        graph.matrix[3] = a4;
        graph.matrix[4] = a5;
//        System.out.println(graph.getOutDegree(1));
//        System.out.println(graph.getFirstNeighbor(3));
//        System.out.println(graph.getNextNeighbor(4,0));
        graph.depthFirstSearch();
    }

}
