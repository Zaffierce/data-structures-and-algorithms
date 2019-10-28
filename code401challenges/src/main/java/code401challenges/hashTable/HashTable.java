package code401challenges.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//If duplicate, throw exception

public class HashTable<K, V> {

    public ArrayList<LinkedList<HashNode<K, V>>> bucket;
    public int numOfBuckets;
    public int bucketSize;

    public HashTable() {
        bucket = new ArrayList<>();
        numOfBuckets = 10;
        bucketSize = 0;

        for (int i = 0; i < numOfBuckets; i++) {
            bucket.add(null);
        }
    }

    public int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numOfBuckets;
        return index;
    }

    public void add(K key, V value) {
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);

        while (head != null) {
            if (head.key.equals(key)){
                head.value = value;
                return;
            } else {
                head = head.next;
            }
        }
        bucketSize++;
        head = bucket.get(index);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        bucket.set(index, newNode);

        if ((1.0*bucketSize) / numOfBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucket;
            bucket = new ArrayList<>();
            numOfBuckets = 2 * numOfBuckets;
            bucketSize = 0;
            for (int i = 0; i < numOfBuckets; i++){
                bucket.add(null);
            }
            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V remove (K key) {
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);
        HashNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            } else {
                prev = head;
                head = head.next;
            }
        }
        if (head == null) {
            return null;
        }
        bucketSize--;
        if (prev != null) {
            prev.next = head.next;
        } else {
            bucket.set(index, head.next);
        }
        return head.value;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            } else {
                head = head.next;
            }
        }
        return null;
    }

    public boolean contains(K key) {
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            } else {
                head = head.next;
            }
        }
        return false;
    }


//    Math.abs... key == null... key.hashCode() % values.length
    //Shows which bucket it lives in
    public int hash(K key) {

        int index = getBucketIndex(key);
        HashNode<K, V> head = bucket.get(index);

        if (head.key.equals(null)) { return 0; }
        else {
            return head.key.hashCode() % bucket.size();
        }
    }



    //Add<K, V>
    //Remove<K>
    //Get<K> - Returns index
    //Contains<K> - Returns T/F

    public static void main (String[] args) {
//        HashTable hashTable = new HashTable();
//        hashTable.add("This", 1);
//        hashTable.add("Lab", 2);
//        hashTable.add("Is", 3);
//        hashTable.add("Fun", 4);
//        System.out.println(hashTable.contains("Fun"));
//        System.out.println(hashTable.get("Is"));
//        hashTable.remove("Is");
//        System.out.println(hashTable.get("Is"));
//        System.out.println(hashTable.hash("Lab"));
//        System.out.println(hashTable.get("Badger"));
    }
}
