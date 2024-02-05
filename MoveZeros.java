public class Solution {
    
    public void moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;                //there were three nums inequal to 0, so j=3
            }
        }
        while (j < nums.length) {   //in this step j=3, so num[4] and num[5] will be replaced by 0
            nums[j] = 0;
            j++;
        }
     }
}