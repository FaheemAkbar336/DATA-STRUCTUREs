import java.util.Scanner;

class Undo_Redo {
    private int arr[];
    private int capacity;
    int numelement = 0;

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
        Undo_Redo s1 = new Undo_Redo(5);
        Scanner scanner = new Scanner(System.in);
        // s1.push(1);
        // s1.push(2);
        // s1.pop();
        // s1.pop();
        // s1.push(3);

        // System.out.println("Top element is: " + s1.peek());
        // System.out.println("Stack size is " + s1.size());

        System.out.println("Enter your choice \n 1.Insert \n 2.Undo \n 3.Redo \n 4.Display Stack ");
        int input = scanner.nextInt();
        if (input == 1) {
            s1.push(5);
        }

        else if (input == 2) {
            s1.pop();
        } else if (input == 3) {
            s1.top();
        }

    }
}





import java.util.Scanner;
import java.util.Stack;

public class UndoRedoProgram {

    // Stacks for undo and redo operations
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    // Insert operation: Push the action onto the undo stack, clear redo stack
    public void insertAction(String action) {
        undoStack.push(action);
        redoStack.clear();  // Clear redo stack on new action
        System.out.println("Inserted: " + action);
    }

    // Undo operation: Pop the last action from the undo stack and push it onto the redo stack
    public void undo() {
        if (!undoStack.isEmpty()) {
            String lastAction = undoStack.pop();
            redoStack.push(lastAction);
            System.out.println("Undone: " + lastAction);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    // Redo operation: Pop the last undone action from the redo stack and push it onto the undo stack
    public void redo() {
        if (!redoStack.isEmpty()) {
            String lastUndoneAction = redoStack.pop();
            undoStack.push(lastUndoneAction);
            System.out.println("Redone: " + lastUndoneAction);
        } else {
            System.out.println("No actions to redo.");
        }
    }

    // Display the contents of the undo and redo stacks
    public void displayStacks() {
        System.out.println("Undo Stack: " + undoStack);
        System.out.println("Redo Stack: " + redoStack);
    }

    public static void main(String[] args) {
        UndoRedoProgram program = new UndoRedoProgram();
        Scanner scanner = new Scanner(System.in);

        // Simulate the flow for user input
        while (true) {
            System.out.println("\nPlease enter your choice:");
            System.out.println("1 for insert, 2 for undo, 3 for redo, 4 for display stack, 5 to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1: // Insert action
                    System.out.println("Enter the action to insert:");
                    String action = scanner.nextLine();
                    program.insertAction(action);
                    break;
                case 2: // Undo last action
                    program.undo();
                    break;
                case 3: // Redo last undone action
                    program.redo();
                    break;
                case 4: // Display stacks
                    program.displayStacks();
                    break;
                case 5: // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
