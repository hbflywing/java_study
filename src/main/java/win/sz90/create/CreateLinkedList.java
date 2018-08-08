package win.sz90.create;

import java.util.Arrays;
import java.util.List;

public class CreateLinkedList {
    static class Node{
        private final Integer data;
        private Node next;

        public Node(Integer data){
            this.data = data;
            next = null;
        }

    }

    public Node createLinkedList(List<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        Node head = new Node(list.get(0));
        Node nextHead = createLinkedList(list.subList(1,list.size()));
        head.next = nextHead;
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList createLinkedList = new CreateLinkedList();
        print(createLinkedList.createLinkedList(Arrays.asList()));
        print(createLinkedList.createLinkedList(Arrays.asList(1)));
        System.out.println("");
        print(createLinkedList.createLinkedList(Arrays.asList(1,2,3,4,5,6)));
    }

    public static void print(Node node){

            while(node != null){
                System.out.print(node.data);
                node = node.next;
            }

    }
}
