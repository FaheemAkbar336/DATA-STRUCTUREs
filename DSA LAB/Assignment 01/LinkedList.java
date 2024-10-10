public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public String nthFromLast(int n) {
        if (head == null) {
            return "LIST_EMPTY";
        }

        Node main_ptr = head;
        Node ref_ptr = head;

        int count = 0;
        while (count < n) {
            if (ref_ptr == null) {
                return "LIST_EMPTY";
            }
            ref_ptr = ref_ptr.next;
            count++;
        }

        while (ref_ptr != null) {
            main_ptr = main_ptr.next;
            ref_ptr = ref_ptr.next;
        }

        return String.valueOf(main_ptr.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(50);
        list.push(40);
        list.push(30);
        list.push(20);
        list.push(10);

        int n = 2;
        System.out.println(list.nthFromLast(n)); // Output: 40
    }
}
