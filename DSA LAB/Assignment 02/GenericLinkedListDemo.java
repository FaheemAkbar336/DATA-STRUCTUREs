class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T data) {
        if (head == null) {
            return; 
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

// Main class to demonstrate the usage of the generic LinkedList
public class GenericLinkedListDemo {
    public static void main(String[] args) {
        // Create a linked list for integers
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.print("Integer LinkedList: ");
        intList.display();

        intList.remove(20);
        System.out.print("After removing 20: ");
        intList.display();

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Generic");

        System.out.print("String LinkedList: ");
        stringList.display();

        System.out.println("Contains 'World'? " + stringList.contains("World"));
        System.out.println("Contains 'Java'? " + stringList.contains("Java"));
    }
}
