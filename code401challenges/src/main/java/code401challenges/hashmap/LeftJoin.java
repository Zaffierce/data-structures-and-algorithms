package code401challenges.hashmap;

import code401challenges.hashTable.HashNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LeftJoin {

    public ArrayList<HashNode>[] bucket = new ArrayList[10];

    public int hash(String key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % bucket.length);
        return index;
    }
//
//    public void add(String key, int value) {
//        int index = hash(key);
//        HashNode newNode = new HashNode(key, value);
//        if (bucket[index] == null) {
//            bucket[index] = new ArrayList<>();
//        } else {
//            bucket[index].add(newNode);
//        }
//    }

    public String[] LeftJoin(HashMap One, HashMap Two) {
        String[] answer = new String[One.size()];
        Iterator it = One.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey());
        }
//        int curr = hash()
//        int key = One.get();
//        int index = hash(key)
//    add(One.get());



        return answer;
    }
}
