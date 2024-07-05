import java.util.HashSet;
import java.util.Set;

class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (Integer i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (Integer i : nums2) {
            set2.add(i);
        }
        Set<Integer> mainSet = new HashSet<>(); // mainSet for merge of two sets
        for (Integer i : set1) {                // traversing thru the set1 to find the intersection numbers with set2
            if (set2.contains(i)) {
                mainSet.add(i);
            }
        }
        int[] intersection = new int[mainSet.size()];   // conversion of set (mainSet) to array of int
        int j = 0;
        for (Integer i : mainSet) {     // traverse thru the mainSet (Integer instead if int due to Set)
            intersection[j] = i;
            j++;
        }
        return intersection;
    }
}