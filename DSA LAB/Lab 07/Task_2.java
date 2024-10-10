public class Task_2 {
    public void printForward(char[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.println("Forward:  " + arr[index] + " ");

        printForward(arr, index + 1);
    }

    public void backword(char[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        backword(arr, index - 1);
    }

    public static void main(String[] args) {
        Task_2 t2 = new Task_2();
        char arr[] = { 'a', 'b', 'c', 'd' };
        t2.printForward(arr, 3);
        t2.backword(arr, 3);

    }

}
