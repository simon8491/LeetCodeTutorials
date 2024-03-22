class PlusOne {
    public static int[] plusOne(int[] digits) {
        // Iterate from right to left to get to the end of the array list
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;    // Increment current digit (the last one)
            if (digits[i] < 10)
                return digits;
            // If digit overflows, set it to 0 and continue with next digit
            digits[i] = 0;
        }
        // If the loop completes without returning, it means there's a carry to the leftmost digit
        // Create a new array with an extra digit at the beginning
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Carry
        return result;
    }
}