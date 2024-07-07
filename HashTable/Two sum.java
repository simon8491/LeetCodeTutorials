import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            target -= nums[i];
            if (sum.containsKey(target)) {
                return new int[]{sum.get(target), i};
            }
            sum.put(i, nums[i]);
        }
        return new int[]{};
    }
}