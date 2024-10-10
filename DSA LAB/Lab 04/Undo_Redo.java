import java.util.Scanner;

class Undo_Redo {

    Undo_Redo(int size) {
        arr = new int[size];
        capacity = size;
        numelement = -1;
    }

    void push(int data) {
        numelement++;
        arr[numelement] = data;

    }

    int pop() {
        if (numelement < 0) {
            return 0;
        }
        return arr[numelement--];
    }

    public int top() {
        return arr[numelement];

    }
    // private int arr[];
    // private int capacity;
    // int numelement = 0;

    // Undo_Redo(int size) {
    // arr = new int[size];
    // capacity = size;
    // numelement = -1;
    // }

    // public void push(int data) {
    // numelement++;
    // arr[numelement] = data;

    // }

    // public int pop() {
    // if (numelement < 0) {
    // return 0;

    // }

    // return arr[numelement--];
    // }

    // public int top() {
    // return arr[numelement];

    // }

    // public int size() {
    // return numelement;
    // }

    // public Boolean isEmpty() {
    // return numelement == -1;

    // }

    // public Boolean isFull() {
    // return numelement == capacity - 1;
    // }

    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        Scanner scanner = new Scanner(System.in);
        // s1.push(1);
        // s1.push(2);
        // s1.pop();
        // s1.pop();
        // s1.push(3);

        // System.out.println("Top element is: " + s1.peek());
        // System.out.println("Stack size is " + s1.size());

        System.out.println("Enter a Integer/n  1. Insert/n  2.Undo /n 3.Redo /n 4.Display Stack ");
        int input = scanner.nextInt();
        if (input == 1) {
            s1.push();
        }

        else if (input == 2) {
            s1.pop();
        } else if (input == 3) {
            s1.top();
        }

    }
}
