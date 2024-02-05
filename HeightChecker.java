import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length); // Create a copy of heights
        Arrays.sort(expected); // Sort the copy in non-decreasing order

        int count = 0; // Initialize a counter for the number of mismatches

        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != expected[i]) {
                ++count; // Increment count when there is a mismatch
            }
        }
        return count; // Return the total count of mismatches
    }
}
