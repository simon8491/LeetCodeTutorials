public class MaxConsecutive1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0, max = 0;
        for (int i = 0; i < nums.length; i++)   {
            if (nums[i] == 1)   {
                curr++;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        return Math.max(max, curr);
    }
}
