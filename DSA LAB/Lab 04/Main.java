class Queue {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }

  
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }
        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[rear] = item;
        rear = (rear + 1) % capacity;
        count++;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1; 
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public Boolean isEmpty() {
        return (count == 0);
    }

    public Boolean isFull() {
        return (count == capacity);
    }
}

class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());
        System.out.println("Queue size is " + q.size());
        q.dequeue();
        q.dequeue();
        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
}
