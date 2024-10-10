//import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    Node head;

    void addToBack(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null)
                n = n.next;
            n.next = node;
        }
    }

    void printList() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data + " ");

    }

    void addToFront(int data) {

        Node node = new Node(data);
        if (head == null) {
            head.next = node;

        } else {
            node.next=node;
            head=node;

        }

    }

    void addMiddle(int index, int data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        Node n = head;
        for (int i = 1; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    void removeFromFront() {
        head = head.next;
    }

    void removeFromBack() {
        Node n = head;
        while (n.next.next != null)
            n = n.next;
        n.next = null;
    }
}

public class Main {
    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();
        ll.addToFront(3);
        ll.addToFront(5);

        ll.addMiddle(2, 8);
        ll.addToBack(5);
        ll.addToBack(9);

        ll.removeFromFront();
        ll.removeFromBack();

    }
}
