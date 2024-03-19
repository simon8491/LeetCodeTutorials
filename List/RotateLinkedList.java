class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = null;
    }
}

class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;

        ListNode current = head;
        int length = 1;
        while(current.next != null) {
            length++;
            current = current.next;
        }
        current.next = head;    // make circular linked list by connecting the last node to the first one (head)
        k = k % length;     // to secure the positive number for pointer in the case the length is less than k
        k = length - k;     // get number of which node in order will be the head after the rotation
        while(k != 0) {
            current = current.next;
            k--;
        }
        head = current.next;
        current.next = null;    // to break the circle

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}