class ListNode {
    int val;   // number or another value stored in the node
    ListNode next;  // following node after this one
    
    public ListNode(int val) {    // constructor
        this.val = val;
    }
}

class MyLinkedList {
    ListNode head;

    public MyLinkedList() {
        this.head = null;
    }
    
    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        ListNode current = head;    // declare current node (ListNode oject) to iterate over linked list
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        return current != null ? current.val : -1; // if (current != null) {
                                                    //     return current.val;
                                                    // } else {
                                                    //     return -1;
                                                    // }    
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;    // since the new node will be the first one in the list, it has to be connected to head of the current node
        head = newNode;         // then the new node is makred as a head one
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode; 
            return;
        }
        ListNode current = head;
        while (current.next != null) {      // iterate over whole linked list
            current = current.next;
        }
        current.next = newNode;
    }
    
    public void addAtIndex(int index, int val) { // Add a node of value "val" before the indexth node in the linked list.
        if (index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val); 
            return;
        }

        ListNode newNode = new ListNode(val);  // new node for this task
        ListNode current = head;    // declare it as head because it starts to iterate from the beginning

        for (int i = 0; i < index - 1 && current != null; i++) {   // iterate until index is -1
            current = current.next;
        }
        if (current == null) {return;}

        newNode.next = current.next;
        current.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0) {return;}
        if (index == 0) {
            if (head != null) {
                head = head.next; // replace the first node (index 0) by the next one
            }
            return;
        }
        ListNode current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {  // iterate over linkedlist until node at specified index found
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        current.next = current.next.next;   // delete node by rearanging pointers
    }
}