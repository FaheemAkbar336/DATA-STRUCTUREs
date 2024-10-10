class Node2 {
    int data; // integer data
    Node2 next; // pointer to the next node

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack2 {
    private int size;

    public Stack2() {
        this.size = 0;
    }

    Node2 head;

    // Utility function to add an element x in the stack
    public void push(int data) // insert at the beginning
    {
        // Write your code here
        Node2 node = new Node2(data);
        if (head == null) {
            node = head;
            return;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int peek() {
        return head.data;
    }

    // Utility function to pop top element from the stack and
    // check for Stack underflow
    public void pop() // remove at the beginning
    {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");

        } else {
            int a = head.data;
            head.next.next = head;
            size--;

        }

    }

    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}