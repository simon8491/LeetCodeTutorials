/**
*  Given an array arr of integers, check if there exist two indices i and j such that :
*  
*  i != j
*  0 <= i, j < arr.length
*  arr[i] == 2 * arr[j]
*/

class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {                  // because j cannot equals to i
                if (2 * arr[i] == arr[j] || arr[i] == 2 * arr[j]) {   // looping and comparing each number with index j to the first num with index i, thend with second one...
                    return true;
                }
            }        
        }
        return false;
    }
}
