class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }
}

class FlattenedMultilevelDoublyList {
    public static Node flatten(Node head) {
        if(head == null){
            return head;
        }
        Node current = head;
        while (current != null) {   //Traverse through the list, and for each node, check if it has a child.
            if (current.child != null) {    //If it has a child, adjust the pointers to insert the child list between the current node and its next node.
                Node next = current.next;
                Node child = current.child;
                current.next = child;
                child.prev = current;
                current.child = null;
                while (child.next != null) {
                    child = child.next;
                }
                child.next = next;
                if (next != null) {
                    next.prev = child;
                }
            }
            current = current.next;
        }
        return head;
    }
}