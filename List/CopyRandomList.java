class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
    //1.Initialization and Interweaving:
        Node current = head;
        while (current != null) {  //Traverse the original list.
            //For each node, create a corresponding new node and place it between the current node and the current node's next.
            Node newNode = new Node(current.val);
            // A->A'->B->B'...
            current.next = newNode;
            current = newNode.next;
        }
    //2.Setting Random Pointers:
        current = head;
        while (current != null) {  //Traverse the interweaved list.
            if (current.random != null) {  //For each old node, set its corresponding new node's random pointer.
                current.next.random = current.random.next;
            }
            current = current.next != null ? current.next.next : null;
        }
        //3.Separating Lists:
        Node oldHead = head;
        Node newHead = head.next;
        Node currOld = oldHead;
        Node currNew = newHead;
        while (currOld != null) {   //Traverse the interweaved list again to separate the old and new lists.
            currOld.next = currOld.next.next;
            currNew.next = currNew.next != null ? currNew.next.next : null;
            currOld = currOld.next;
            currNew = currNew.next;
        }
        
        return newHead;
    }
}