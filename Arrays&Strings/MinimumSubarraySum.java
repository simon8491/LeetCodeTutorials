class MinimumSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
/*
target = 7, nums = [2, 3, 1, 2, 4, 3] // output: 2
                    i/j (2)           // i = start, j = end
                    i  j (5)
                    i     j (6)
                    i        j (8)    // increasing j does not give us a better solution
                        i     j (6)
                        i        j (10)
                            i     j (7)
                                i  j (6)
                                i     j (9)
                                i  j (7)
                                    i/j (3)
*/
