public class Node {
    String name;
    Node prev, next;

    Node(String name) {
        this.prev = null;
        this.next = null;
        this.name = name;
    }


public class DoubleLinkedList {
    Node head;
    // Add node with name in beginning of linkedlist, name as parameter

    public void insertAtBeginning(String name) {
        Node n = new Node(name);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            n.next = temp;
            head.prev=n;
            n.next=head;
        }
    }

    // Add node in beginning of linkedlist, node as parameter
    public void insertAtBeginning(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    // Add node in end of linkedlist, name as parameter
    public void insertAtEnd(String name) {
        Node n = new Node(name);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while( temp.next != null){
                temp=temp.next;

                n.prev=temp;
                temp.next=n;
                n.prev=temp;
            }
    }

    // Add node in end of linkedlist, node as parameter
    public void insertAtEnd(Node node) {
    }
    // Add node after name which is provided as param , name and node as params

    public void insertAfterName(String name, Node node) {
    }

    // Add node before name which is provided as param , nameand node as params

    public void insertBeforeName(String name, Node node) {
    }

    // Make double linkedlist as Circular Double LinkedList
    public void makeCircular() {
    }
    // Print all the nodes in linkedlist, make sure it works on circular

   // double linkedlist(){}

    public void printAll() {
    }

    // Test the class
    
    public static void main(String[] args) {
        // Test all above methods
        
    
    }

}
}