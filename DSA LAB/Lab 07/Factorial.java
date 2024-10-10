public class Factorial {
    public void fact(int n) {
        int result = 1;
        while (n > 0) {
            result = n * result;
            n--;
        }
        System.out.println("Result: " + result);
    }

    int rFact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Factorial f1 = new Factorial();
        f1.fact(7);
        f1.rFact(7);
    }

}
