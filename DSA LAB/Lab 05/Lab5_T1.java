class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    public void Add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node Nextnode = current.next;
            current.next = prev;
            prev = current;
            current = Nextnode;
        }
        head = prev;
    }

    void printList() {
        if (head == null) {
            System.out.println("linked is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

}

class Lab5_T1 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.Add(2);
        l1.Add(4);
        l1.Add(6);
        l1.Add(8);
        l1.Add(9);
        l1.Add(3);

        l1.printList();

        System.out.println("reverse a linked list");
        l1.reverse();
        l1.printList();
    }
}