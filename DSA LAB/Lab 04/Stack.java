class Stack {
    private int arr[];
    private int capacity;
    int numelement = 0;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        numelement = -1;
    }

    public void push(int data) {
        numelement++;
        arr[numelement] = data;

    }

    public int pop() {
        if (numelement < 0) {
            return 0;

        }

        return arr[numelement--];
    }

    public int top() {
        return arr[numelement];

    }
    public int size()
 {
    return numelement;
 }
 public Boolean isEmpty()
 {
    return numelement== -1;

    
 }
 public Boolean isFull()
 {
    return numelement==capacity-1; 
 }
        public static void main(String[] args) {
            Stack s1 = new Stack(5);
            s1.push(1);            
            s1.push(2);             
            s1.pop();                   
            s1.pop();                   
            s1.push(3);            
            
//            System.out.println("Top element is: " + s1.peek());
            System.out.println("Stack size is " + s1.size());

        }
    }


