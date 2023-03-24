package linkedlist;
public class LinkedList {

    Node head;
    int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    public LinkedList(Node head, int count) {
        this.head = head;
        this.count = 1;
    }

    public void add(int newData){
        Node temp = new Node(newData);

    }

    public static void main(String[] args) {

    }
}