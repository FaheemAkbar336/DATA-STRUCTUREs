class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack1 {
    private Node top;

    public Stack1() {
        this.top = null;
    }

    public void push(int data) {
        Node n = new Node(data);
        if (top == null) {
            top = n;
        } else {
            n.next = top;
            top = n;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        top = top.next;
    }
}

class StackImpl {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.top());
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
