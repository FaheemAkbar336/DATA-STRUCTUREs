import java.util.Arrays;

public class TwoSum {

    public boolean twoSum(int[] arr, int K) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];

            if (sum == K) {
                return true;
            } else if (sum < K) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();

        int[] arr = { 8, 4, 1, 6 };
        int K = 10;

        if (solver.twoSum(arr, K)) {
            System.out.println("Yes, there are two numbers whose sum is " + K);
        } else {
            System.out.println("No, there aren't two numbers whose sum is " + K);
        }
    }
}
