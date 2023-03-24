package linkedlist;
public class Node {

    Node next;
    int data;

    public Node() {
    }
    public Node(Node next, int newData) {
        this.next = next;
        this.data = newData;
    }

    public Node(int newData) {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
