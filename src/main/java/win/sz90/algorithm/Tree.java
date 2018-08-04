package win.sz90.algorithm;

public class Tree {

    static int count = 1;

    public static void preSearch(Node node){
        System.out.print(node.data);
        if(node.lChild != null){
            preSearch(node.lChild);
        }
        if(node.rChild != null){
            preSearch(node.rChild);
        }
    }

    public static void midSearch(Node node){
        if(node.lChild != null){
            midSearch(node.lChild);
        }
        System.out.print(node.data);
        if(node.rChild != null){
            midSearch(node.rChild);
        }
    }

    public static void endSearch(Node node){
        if(node.lChild != null){
            endSearch(node.lChild);
        }
        if(node.rChild != null){
            endSearch(node.rChild);
        }
        System.out.print(node.data);
    }

    public static int getNodeSize(Node node){

        if(node == null){
            return 0;
        }else {
            return 1+ getNodeSize(node.rChild)+getNodeSize(node.lChild);
        }
    }

    public static int getHeight(Node node){
        if(node == null){
            return 0;
        }else {
            int i = getHeight(node.lChild);
            int j = getHeight(node.rChild);
            //哪边多取哪边
            return i>j?i+1:j+1;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        node1.data = "A";
        node2.data = "B";
        node3.data = "C";
        node4.data = "D";
        node5.data = "E";
        node6.data = "F";
        node1.lChild = node2;
        node1.rChild = node3;
        node2.lChild = node4;
        node2.rChild = node5;
        node3.rChild = node6;
        preSearch(node1);
        System.out.println("");
        midSearch(node1);
        System.out.println("");
        endSearch(node1);
        System.out.println("");
        System.out.println(getNodeSize(node1));
        System.out.println(getHeight(node1));
    }

    static class Node {
        String data;
        Node rChild;
        Node lChild;
    }
}

