package code401challenges.hashTable;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {

    public LinkedList<HashNode>[] bucket = new LinkedList[10];

    public HashTable() {
        //Initial populate of the HashNode
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<HashNode>();
        }
    }


    public int hash(String key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % bucket.length);
        return index;
    }

    public void add(String key, int value) {
        int index = hash(key);
        HashNode newNode = new HashNode(key, value);
        if (bucket[index] == null) {
            bucket[index] = new LinkedList<>();
        } else {
            bucket[index].add(newNode);
        }
    }

    public int get(String key) {
        int index = hash(key);
        LinkedList<HashNode> ourHash = bucket[index];
        for (HashNode storage : ourHash) {
            if (key.equals(storage.key)) {
                return storage.value;
            }
        }
//        throw new NullPointerException("Value not found!");
        return -1;
    }

    public boolean contains(String key) {
        int index = hash(key);
        LinkedList<HashNode> ourHash = bucket[index];
        for (HashNode storage : ourHash) {
            if (key.equals(storage.key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

//        StringBuilder string = new StringBuilder();
//        string.append("Hash Table: ");
//        for (int i = 0; i < bucket.length; i++) {
//            System.out.println(bucket[i].get(i));
//        }
        return "Hash Table: " + Arrays.toString(bucket);
//        return "Key: " + bucket
//        return "Key: " + this.key + " && Value: " + this.value;
    }

//    public static void main(String[] args) {
//        HashTable HashTable = new HashTable();
//        HashTable.add("Michelle", 1);
//        HashTable.add("Lab", 2);
//        HashTable.add("Is", 3);
//        HashTable.add("Fun", 4);
//        System.out.println(HashTable.get("Lab"));
//        System.out.println(HashTable.contains("Fun"));
//        System.out.println(HashTable.get("Bob"));
//        System.out.println(HashTable.contains("Fun"));
//        System.out.println(HashTable.get("Is"));
//        System.out.println(HashTable.get("Is"));
//        System.out.println(HashTable.hash("Lab"));
//        System.out.println(HashTable.get("Badger"));
// -   }
}

//Old code... want to keep to come back to later.  + generics.
/*

//public class HashTable<K, V> {

//    public ArrayList<LinkedList<HashNode<K, V>>> bucket;
//    public int numOfBuckets;
//    public int bucketSize;

//    public HashTable() {
//        bucket = new LinkedList[10];
////        numOfBuckets = 10;
////        bucketSize = 0;
//
////        for (int i = 0; i < bucket.length; i++) {
//////            bucket.add(null);
////            bucket.
////        }
//    }
//
//
//    public void add(K key, V value) {
//        int index = getBucketIndex(key);
//        HashNode<K, V> head = bucket.get(index);
//
//        while (head != null) {
//            if (head.key.equals(key)){
//                head.value = value;
//                return;
//            } else {
//                head = head.next;
//            }
//        }
//        bucketSize++;
//        head = bucket.get(index);
//        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
//        newNode.next = head;
//        bucket.set(index, newNode);
//
//        if ((1.0*bucketSize) / numOfBuckets >= 0.7) {
//            ArrayList<HashNode<K, V>> temp = bucket;
//            bucket = new ArrayList<>();
//            numOfBuckets = 2 * numOfBuckets;
//            bucketSize = 0;
//            for (int i = 0; i < numOfBuckets; i++){
//                bucket.add(null);
//            }
//            for (HashNode<K, V> headNode : temp) {
//                while (headNode != null) {
//                    add(headNode.key, headNode.value);
//                    headNode = headNode.next;
//                }
//            }
//        }
//    }
//
//    public V remove (K key) {
//        int index = getBucketIndex(key);
//        HashNode<K, V> head = bucket.get(index);
//        HashNode<K, V> prev = null;
//        while (head != null) {
//            if (head.key.equals(key)) {
//                break;
//            } else {
//                prev = head;
//                head = head.next;
//            }
//        }
//        if (head == null) {
//            return null;
//        }
//        bucketSize--;
//        if (prev != null) {
//            prev.next = head.next;
//        } else {
//            bucket.set(index, head.next);
//        }
//        return head.value;
//    }
//
//    public V get(K key) {
//        int index = getBucketIndex(key);
//        HashNode<K, V> head = bucket.get(index);
//        while (head != null) {
//            if (head.key.equals(key)) {
//                return head.value;
//            } else {
//                head = head.next;
//            }
//        }
//        return null;
//    }
//
//    public boolean contains(K key) {
//        int index = getBucketIndex(key);
//        HashNode<K, V> head = bucket.get(index);
//        while (head != null) {
//            if (head.key.equals(key)) {
//                return true;
//            } else {
//                head = head.next;
//            }
//        }
//        return false;
//    }
//
//
////    Math.abs... key == null... key.hashCode() % values.length
//    //Shows which bucket it lives in
//    public int hash(K key) {
//
//        int index = getBucketIndex(key);
//        HashNode<K, V> head = bucket.get(index);
//
//        if (head.key.equals(null)) { return 0; }
//        else {
//            return head.key.hashCode() % bucket.size();
//        }
//    }



    //Add<K, V>
    //Remove<K>
    //Get<K> - Returns index
    //Contains<K> - Returns T/F

 */
