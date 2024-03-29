class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length < 2) 
        return nums;
// tc = O(n)
// sc = O(n)
        int i = 0;
        int j = nums.length-1;
        while (i < j) {

            while (i < j && nums[i] % 2 == 0) { // searching even numbers from left to right
                i++;
            }
            while (i < j && nums[j] % 2 != 0) { // searching odd numbers from right to left
                j--;                            // decrease the index to prevent overwriting 
            }
            if (i < j) {
                int k = nums[i];    // save the value of the odd number for later moving to the right
                nums[i] = nums[j];  // moving the even number from the rigt to the left
                nums[j] = k;
                i++;
                j--;
            }
        }
        return nums;
    
// tc = O(n)
// sc = O(1)
        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] % 2 == 0) {
            
        //         int k = nums[i];    // save the value of the odd number for later moving to the right
        //         nums[i] = nums[j];  // moving the even number from the rigt to the left
        //         nums[j] = k;
        //         j++;
        //     }
        // }
        // return nums;
    }
}
