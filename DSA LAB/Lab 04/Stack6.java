import java.util.LinkedList;
import java.util.Queue;

class Stack6 {
    private Queue<Integer> q1, q2;

    Stack6() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int data) {
        q2.add(data);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.remove();
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Stack6 stack = new Stack6();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.top()); 

        System.out.println("Popped element is: " + stack.pop()); 

        System.out.println("Top element is: " + stack.top()); 

        stack.push(4);

        System.out.println("Top element is: " + stack.top()); 

        System.out.println("Popped element is: " + stack.pop()); 

        System.out.println("Is the stack empty? " + stack.isEmpty()); 
    }
}
