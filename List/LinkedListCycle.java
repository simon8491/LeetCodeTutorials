class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}

class LinkedListCycle {
    public ListNode detectCycle(ListNode head)  {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slowPointer = head, fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {  // Find the meeting point using Floyd's algorithm (Tortoise and Hare)
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
            if (slowPointer == fastPointer) {
                break;
            }
        }
        if (fastPointer == null || fastPointer.next == null) {  // If there is no cycle
            return null;
        }
        slowPointer = head;     // Move slow to the head and keep fast at the meeting point
        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }
}
