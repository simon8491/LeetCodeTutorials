/**
*Given an array of integers arr, return true if and only if it is a valid mountain array.
*
*Recall that arr is a mountain array if and only if:
*
*arr.length >= 3
*There exists some i with 0 < i < arr.length - 1 such that:
*arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
*arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) 
            return false;
        int i = 0;

        while (i < arr.length-1 && arr[i] < arr[i+1]) {  // comparing only index i before &&
            i++;
        }
        // Peak can't be the first or last element
        if (i == 0 || i == arr.length - 1) {
            return false;
        }
        while (i < arr.length-1 && arr[i] > arr[i+1]) {
            i++;
        }
        // If we reach the end, it's a valid mountain
        if (i == arr.length - 1) {
            return true;
        }
        return false;
    }
}
