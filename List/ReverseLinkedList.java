class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedListReverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;       // the node before the head node
        
        while (head != null) {
            ListNode next = head.next;  // storing a value of the next node
            head.next = prev;   // to reverse the pointer; make it to point to the originaly previous node but consider it as the next
            // 1->2->3->4->5... null<-1 2->3->4->5... 2<-1 3->4->5... 3<-2<-1 4->5... 4<-3<-2<-1 5->null... 5<-4<-3<-2<-1<-null...
            prev = head;
            head = next;
        }
        return prev;
    }
}