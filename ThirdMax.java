import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinctCount = 1;
        // Count distinct elements from the end of the sorted array
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                distinctCount++;
            }
            if (distinctCount == 3) {
                return nums[i - 1];
            }
        }
        // If there are fewer than three distinct elements, return the maximum
        return nums[nums.length - 1];
    }
}
