import java.util.LinkedList;
import java.util.List;

class MyHashSet {
    private final int SIZE = 100; //constant size of array
    //list of the lists to prevent against collision; list interface for using java list functions
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {    //constructor
        buckets = new LinkedList[SIZE];   //initializing new array list with null values
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int index = key % SIZE;   //index will be a reminder of key/array size
        List<Integer> bucket = buckets[index];    //to get the list from List of the Lists -> parent list, which contains child lists
        if (!bucket.contains(key))  {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int index = key % SIZE;
        LinkedList<Integer> bucket = buckets[index];
        bucket.remove((Integer)key);
    }
    
    public boolean contains(int key) {
        int index = key % SIZE;
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */