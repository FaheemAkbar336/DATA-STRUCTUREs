class Node4 {
    int data; 
    Node4 next; 

    public Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue4 {
    private static Node4 rear = null, front = null;


    public static int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        return data;
    }

    public static void enqueue(int item) { 
        Node4 newNode = new Node4(item);
        if (rear == null) {
            front = rear = newNode; 
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public static int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    public static boolean isEmpty() {
        return front == null;
    }
}

class QueueLL {
    public static void main(String[] args) {
        Queue4 q = new Queue4();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.printf("Front element is %d\n", q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        if (q.isEmpty()) {
            System.out.print("Queue is empty");
        } else {
            System.out.print("Queue is not empty");
        }
    }
}
