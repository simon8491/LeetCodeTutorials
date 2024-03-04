class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
 
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add = new ListNode(0);
        ListNode current = add;
        int carry = 0;  //carrying the first digit of two digit result (>9)

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;         
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10; //to get the first digit of two digit number
            current.next = new ListNode(sum % 10);  //just for storing actual sum value
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }   
        }
        return add.next;
    }
}