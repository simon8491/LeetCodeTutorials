/*Intuition:
The hash set approach uses a hash set data structure to store encountered elements.
It iterates through the array, checking if an element is already in the set.
If so, it returns true. Otherwise, it adds the element to the set.
This approach has a time complexity of O(n) and provides an efficient way to check for duplicates.

Explanation:
A more efficient approach is to use a hash set data structure to store the encountered elements.
While iterating through the array, if an element is already present in the hash set, return true.
Otherwise, add the element to the hash set.
If the loop completes without finding any duplicates, return false. */
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums)    {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
}