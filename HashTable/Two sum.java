import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (sum.containsKey(complement)) {
                return new int[]{sum.get(complement), i};
            }
            sum.put(i, nums[i]);
        }
        return new int[]{};
    }
}