class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}

class LinkedListIntercestion {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        // Pointers for traversing the lists
        ListNode pointA = headA;
        ListNode pointB = headB;
        // Traverse both lists until they intersect or reach the end
        while (pointA != pointB)    {   // Move pointers to the next node
            if (pointA == null) {   // pointA = (pointA == null) ? headB : pointA.next;
                pointA = headB;
            } else {pointA = pointA.next;}
            if (pointB == null) {   // pointB = (pointB == null) ? headA : pointB.next;
                pointB = headA;
            } else {pointB = pointB.next;}
        }
        return pointA;  // Return the intersecting node or null if no intersection
    }
}