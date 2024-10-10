public class Task_1 {

    public void ascending(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start + " ");

        ascending(start + 1, end);
        System.out.println();
    }

    public int descending(int a) {
        if (a < 0) {
            return 1;
        }

        System.out.print(a + " ");
        return descending(a - 1);

    }

    public static void main(String[] args) {
        Task_1 t1 = new Task_1();
        t1.ascending(2, 8);

        t1.descending(9);
    }
}