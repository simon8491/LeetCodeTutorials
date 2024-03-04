class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
}
 
class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);  //for storing the value of each head in merged list
        ListNode current = merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;   //to be able to iterate thru the current list, list1 is added to .next
                list1 = list1.next; // then iterate thru the list1 list
            } else {
                current.next = list2;
                list2 = list2.next;
            }
           current = current.next;  //in while loop, current.next was filled with value and now it's
        }                           // moved to current due to make a space for new value taken from while loop
        if (list1 != null) {    //this statement adds the last value to merged list
            current.next = list1;
        } else {
            current.next = list2;
        }
        return merged.next;
    }
}