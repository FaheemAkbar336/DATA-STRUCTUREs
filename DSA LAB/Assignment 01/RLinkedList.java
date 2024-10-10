class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RLinkedList {
    Node head;

    void reverse() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RLinkedList list = new RLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(40);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(10);

        System.out.println("Original List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}
