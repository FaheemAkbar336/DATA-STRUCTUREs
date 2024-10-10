class Node {
    int data; 
    Node next; 

    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList_i {
    Node head; 

    public void printList() {
        Node current = head; 

        while (current != null) {
            System.out.print(current.data + " "); 
            current = current.next; 
        }
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

public class Main {
    public static void main(String[] args) {
        LinkedList_i list = new LinkedList_i();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println("Linked List:");
        list.printList(); 
    }
}
