package Hashing;

import java.util.*;

public class ChainingImplementation {

    int bucket;
    ArrayList<LinkedList<Integer>> table;

    ChainingImplementation(int bucketLength) {
        this.bucket = bucketLength;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0;i<bucketLength;i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key){
        int hashValue = key%this.bucket;
        table.get(hashValue).add(key);
    }
    void delete(int key){
        int hashValue = key%this.bucket;
        table.get(hashValue).remove(key);
    }
    boolean search(int key){
        int hashValue = key%this.bucket;
        return  table.get(hashValue).contains(key);
    }
}
