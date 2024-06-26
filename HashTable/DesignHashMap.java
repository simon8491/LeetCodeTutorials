public class DesignHashMap { //Create a class Node to represent key-value pairs.
    int key;
    int val;
    DesignHashMap next;

    DesignHashMap(int key, int val)  {
        this.key = key;
        this.val = val;
        this.next = null;
    }
}

class MyHashMap {
    private DesignHashMap[] map;

    public MyHashMap() {
        map = new DesignHashMap[1000];   //Initialize an array map to store nodes, with a length of 1000.
        for (int i = 0; i < 1000; i++) {    //For each index in the map array, create a new Node 
            map[i] = new DesignHashMap(-1, -1);      //and append it to the array.
        }
    }
    
    public void put(int key, int value) {
        int index = hash(key);  //Calculate the hash using the hash method based on the key.
        DesignHashMap current = map[index];  //Access the node at the calculated hash index.
        while (current.next != null) {     //Traverse the linked list starting from this node.
            if (current.next.key == key) {  //If a node with the given key is found, update its value and return.
                current.next.val = value;
                return;
            }
            current = current.next;
        }
        current.next = new DesignHashMap(key, value); //If the end of the linked list is reached,
    }                                        //add a new node with the given key and value.
    
    public int get(int key) {
        int index = hash(key);  //Calculate the hash using the hash method based on the key.
        DesignHashMap current = map[index].next; //Access the node at the calculated hash index.
        while (current != null) {  //Traverse the linked list starting from this node.
            if (current.key == key) {
                return current.val;
            }
            current = current.next;
        }
        return -1;              //If the end of the linked list is reached, return -1.
    }   
    
    public void remove(int key) {
        int index = hash(key);
        DesignHashMap current = map[index]; //Access the node at the calculated hash index.
        while (current.next != null) { //Traverse the linked list starting from this node.
            if (current.next.key == key) {  //If a node with the given key is found,
                current.next = current.next.next; //remove it by adjusting the next reference.
                return;
            }
            current = current.next; //If the end of the linked list is reached, do nothing.
        }
    }

    private int hash(int key)   {
        //Calculate the hash by taking the remainder of the key 
        //divided by the length of the map array.
        return key % 1000;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */