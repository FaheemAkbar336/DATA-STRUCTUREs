import java.util.Random;

public class Search_I {
    int search(int n) {
        Random r1 = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand = r1.nextInt(0, 9);
            arr[i] = rand;
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            if (n == arr[i]) {
                System.out.println();
                return 1;
            }
        }
        System.out.println();
        return 1;

    }

    public static void main(String[] args) {
        Search_I si = new Search_I();
        si.search(5);
    }

}
