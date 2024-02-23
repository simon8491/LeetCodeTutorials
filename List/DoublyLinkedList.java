class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    ListNode head;

    public DoublyLinkedList()   {
        this.head = null;
    }
    public int get(int index)   {
        if (index < 0) {return -1;}

        ListNode current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        return current != null ? current.val : -1;
    }
    public void addAtHead(int val)  {
        ListNode newNode = new ListNode(val);
        if (head == null ) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addAtTail(int val)  {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    public void addAtIndex(int index, int val)  {
        ListNode newNode = new ListNode(val);
        if (index < 0) {
            return;
        } else if (index == 0) {
            addAtHead(val); 
            return;
        }
        ListNode current = head;
        for (int i = 0; i < index-1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {return;}
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current.prev;
    }
    public void deleteAtIndex(int index)    {
        if (index < 0) {return;}
        if (index == 0) {
            if (head != null) {
                head = head.next; // replace the first node (index 0) by the next one
            } return;}
        ListNode current = head;
        for (int i = 0; i < index-1 && current != null; i++)  {
            current = current.next;
        }
        if (current == null || current.next == null) {return;}
        current.next = current.next.next;
    }
}