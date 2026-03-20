import java.util.*;

public class shiftedArray {
    public static void main(String args[]) {
        int[] original = {1, 2, 3, 4, 5};
        int[] shifted = {3, 4, 5, 6, 2};

        List<Integer> result = new ArrayList<>(); // dynamic list

        for (int i = 0; i < original.length; i++) {
            if (original[i] == shifted[i]) {
                result.add(i); // store matching index
            }
        }

        // Print result
        System.out.println(result);
    }
}