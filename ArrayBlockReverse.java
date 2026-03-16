

import java.util.Arrays;

public class ArrayBlockReverse {

    // Function to reverse array blocks except the middle block
    public static void reverseBlocks(int[] arr, int blockSize) {
        int n = arr.length;
        int totalBlocks = (n + blockSize - 1) / blockSize; // ceil division
        int midBlock = totalBlocks / 2; // middle block index

        // Helper function to reverse elements from start to end (inclusive)
        java.util.function.BiConsumer<Integer, Integer> reverse = (start, end) -> {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        };

        // Reverse blocks before middle
        for (int b = 0; b < midBlock; b++) {
            int start = b * blockSize;
            int end = Math.min((b + 1) * blockSize - 1, n - 1);
            reverse.accept(start, end);
        }

        // Reverse blocks after middle
        for (int b = totalBlocks - 1; b > midBlock; b--) {
            int start = b * blockSize;
            int end = Math.min((b + 1) * blockSize - 1, n - 1);
            reverse.accept(start, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int blockSize = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseBlocks(arr, blockSize);
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}