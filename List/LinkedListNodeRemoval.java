class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

class LinkedListNodeRemoval {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointA = head;
        ListNode pointB = head;

        for (int i = 0; i < n; i++) {
            pointA = pointA.next;
        }
        if(pointA == null) {    // in case the list is shroter than 2 nodes
            return head.next;
        }
        while (pointA != null && pointA.next != null) { // to move the last node to removed one
            pointA = pointA.next;
            pointB = pointB.next;
        }
        pointB.next = pointB.next.next;
        return head;
    }
}