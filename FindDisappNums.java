import java.util.ArrayList;
import java.util.List;

class FindDisappNums {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> missingNums = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int mark = Math.abs(nums[i]) - 1;   // Mark each number as visited by negating the value at the corresponding index. -1 is used for aoiding the out of bound.
            if (nums[mark] > 0) {
                nums[mark] = -nums[mark];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                missingNums.add(i + 1);     // Add the indices of the positive numbers to the missingNums array but not as a indices, but as the
            }
        }
        return missingNums;
    }
}