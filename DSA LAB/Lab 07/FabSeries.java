public class FabSeries {

    void itrFab(int n) {
        if (n < 0) {
            System.out.println("Enter positive integer :");
        }
        int a = 0, b = 1;
        System.out.println("Fibonacci Series with iterative approach up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    int recursiveFab(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return recursiveFab(n - 1) + recursiveFab(n - 2);
    }

    public static void main(String[] args) {
        FabSeries fs = new FabSeries();

        fs.itrFab(9);

        int result = fs.recursiveFab(8);
        System.out.println("Fabonacci series with Recursive Approach: " + result);

    }
}