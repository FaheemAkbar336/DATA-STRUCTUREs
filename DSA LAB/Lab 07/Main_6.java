class Node_6 {
    int data;
    Node next;

    public Node_6(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void printListRecursive(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printListRecursive(node.next);
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
}

public class Main_6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println("Linked List:");
        list.printListRecursive(list.head);
    }
}
