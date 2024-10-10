class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {

    Node Head;

    void addToback(int data) {
        Node node = new Node(data);

        if (Head == null)
            Head = node;

        else {
            Node n = Head;
            while (n.next != null)
                n = n.next;
            n.next = node;
       }
    }

    void printList() {
        Node node = Head;
        while (node.next != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data + " ");
    }

    void addTofront(int data) {
        Node node = new Node(data);
        if (Head == null) {
            Head.next = node;
        } else {
            node.next = Head;
            Head = node;
        }

    }

    int length() {
        int count = 0;
        Node current = Head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}

public class Task2 {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.addToback(5);
        l.addToback(8);
        l.addToback(9);

        l.addTofront(9);
        l.addTofront(6);

        // l.printList();

        System.out.println("Length is : " + l.length());
        l.printList();

    }
}