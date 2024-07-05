/*Concept of XOR:
XOR of zero and some bit returns that bit i.e. x^0 = x...
XOR of two same bits returns 0 i.e. x^x = 0...
And, x^y^x = (x^x)^y = 0^y = y... -> 4^1^2^1^2 -> 4^0^0 = 4
XOR all bits together to find the unique number. */
class SingleNumber {
    public static int singleNumber(int[] nums) {
        int singleOne = 0;
        for (int i = 0; i < nums.length; i++) {
            singleOne ^= nums[i];
        }
        return singleOne;
    }
}