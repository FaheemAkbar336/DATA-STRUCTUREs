public class Main {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1, 5 }; // Custom input array
        // Outer loop
        for (int i = 0; i < arr.length; i++) {
            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {
                // Checking elements
                int temp = 0;
                if (arr[i] % 2 == 0) {
                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            // Printing sorted array elements
            System.out.print(arr[i] + " ");
        }
    }
}
