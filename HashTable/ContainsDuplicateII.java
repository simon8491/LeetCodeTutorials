import java.util.HashMap;
import java.util.Map;

class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (numbers.containsKey(key)) {
                if (i - (numbers.get(key)) <= k) {  //if index - key.value <= k
                    return true;
                }
            }
            numbers.put(nums[i], i);
        }
        return false;
    }
}