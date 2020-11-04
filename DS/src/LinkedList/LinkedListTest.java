package LinkedList;

public class LinkedListTest {
    Node head;

    public static void main(String[] args){
        LinkedListTest list = new LinkedListTest();

        list.head =new Node(1);

        Node second = new Node (3);
        Node third = new Node(11);

        list.head.next = second;
        second.next = third;
    }
}

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;

    }
}
