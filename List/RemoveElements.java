class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = null;
    }
}

class LinkedListRemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {   // to prevent null or incorrect input value of node
            head = head.next;
        }
        ListNode curr = head;   // make local variable to not fuck up the reference of objects in original list; not to remove head from original list
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}