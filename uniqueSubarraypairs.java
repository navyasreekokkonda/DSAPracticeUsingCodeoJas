import java.util.HashMap;

public class uniqueSubarraypairs {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Generate all subarrays and store sum count
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                // increase count of this sum
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // Step 2: Count pairs
        int pairs = 0;

        for (int count : map.values()) {
            if (count > 1) {
                pairs += (count * (count - 1)) / 2;
            }
        }

        // Output
        System.out.println("Pairs = " + pairs);
    }
}