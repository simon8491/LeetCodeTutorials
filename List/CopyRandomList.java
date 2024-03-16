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
        Node curr = head;
        while (curr != null) {  //Traverse the original list.
            //For each node, create a corresponding new node and place it between the current node and the current node's next.
            Node newNode = new Node(curr.val);
            // A->A'->B->B'...
            curr.next = newNode;
            curr = newNode.next;
        }
    //2.Setting Random Pointers:
        curr = head;
        while (curr != null) {  //Traverse the interweaved list.
            if (curr.random != null) {  //For each old node, set its corresponding new node's random pointer.
                curr.next.random = curr.random.next;
            }
            curr = curr.next != null ? curr.next.next : null;
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