import java.util.Stack;

class Queue5 {
    private Stack<Integer> s1, s2;

    Queue5() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4, 5 };
        Queue5 q = new Queue5();
        for (int key : keys) {
            q.enqueue(key);
        }
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}
