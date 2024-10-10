class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void sort() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }

        Node current = head;
        Node index = null;
        int temp;

        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(50);
        list.push(40);
        list.push(20);
        list.push(30);
        list.push(10);

        System.out.println("Input List:");
        list.printList();

        list.sort();

        System.out.println("Sorted List:");
        list.printList();
    }
}
