class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = null;
    }
}

class LinkedListEvenOdd {
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head, even = head, evenHead = even;
// check the head and next node of input list
        if (head != null && head.next != null) {
            even = head.next;
            evenHead = even;
        } else {
            return head;
        }
// if the head is valid and list is longer than one node, sort even and odd nodes
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            even = even.next;
            odd = odd.next;
        }
        odd.next = evenHead;
        return head;
    }
}