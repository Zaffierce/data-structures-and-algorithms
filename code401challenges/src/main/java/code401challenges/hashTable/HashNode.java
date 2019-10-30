package code401challenges.hashTable;

public class HashNode {
//public class HashNode<K, V> {
//    K key;
//    V value;
    String key;
    int value;
    HashNode next;

    public HashNode(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }


//    HashNode<K, V> next;

//    public HashNode(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
}
