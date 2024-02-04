class Solution {
public int removeDuplicates(int[] nums) { 
// The initial length is simply the capacity.
    int length = nums.length;
// Assume the last element is always unique.
// Then for each element, delete it if it's the same as the one after it.
// Use our deletion algorithm for deleting from any index.
    for (int i = length - 2; i >= 0; i--) {
        if (nums[i] == nums[i + 1]) {
// Delete the element at index i, using our standard deletion algorithm we learned.
            for (int j = i + 1; j < length; j++) {
                nums[j - 1] = nums[j];
            }
// Reduce the length by 1.
            length--;
        }
    }
// Return the new length.
    return length;
}

public int[] copyWithRemovedDuplicates(int[] nums) {
        
// Check for edge cases.
    if (nums == null || nums.length == 0) {
        return nums;
    }
  
// Count how many unique elements are in the Array.
    int uniqueNumbers = 0;
    for (int i = 0; i < nums.length; i++) {
// An element should be counted as unique if it's the first element in the Array(index==0), or is different to the one before it.
        if (i == 0 || nums[i] != nums[i - 1]) {
            uniqueNumbers++;
        }
    }
// Create a result Array.
    int[] result = new int[uniqueNumbers];
// Write the unique elements into the result Array.
    int positionInResult = 0;
    for (int i = 0; i < nums.length; i++) {
// Same condition as in the previous loop. Except this time, we can write each unique number into the result Array instead of just counting them.
        if (i == 0 || nums[i] != nums[i - 1]) {
            result[positionInResult] = nums[i];
            positionInResult++;
        }
    }
    return result;
}


// Implementing this requires the use of the two-pointer technique. This is where we iterate over the Array in two different places at the same time.
// tc = O(n)
// sc = O(1)

public int removeDuplicates1(int[] nums) {
// Check for edge cases.
    if (nums == null) {
        return 0;
    }
// Use the two pointer technique to remove the duplicates in-place.
// The first element shouldn't be touched; it's already in its correct place.
    int writePointer = 1;
// Go through each element in the Array.
    for (int readPointer = 1; readPointer < nums.length; readPointer++) {
// If the current element we're reading is *different* to the previous element...
        if (nums[readPointer] != nums[readPointer - 1]) {
// Copy it into the next position at the front, tracked by writePointer.
            nums[writePointer] = nums[readPointer];
// And we need to now increment writePointer, because the next element should be written one space over.
            writePointer++;
        }
    }
// This turns out to be the correct length value.
    return writePointer;
}
}
