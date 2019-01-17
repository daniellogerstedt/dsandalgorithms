package hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<T> {

    protected LinkedList<DataNode<T>>[] buckets;

    private static class DataNode<T> {
        String key;
        T data;

        private DataNode (String k, T v) {
            this.key =  k;
            this.data = v;
        }

    }

    public HashTable (int Initial) {
        this.buckets = new LinkedList[Initial];
    }

    public HashTable () {
        this(100);
    }

    public int getHash (String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += (int)c;
        }
        hash = hash%this.buckets.length;
        return hash;
    }

    public void add (String key, T value) {
        int hash = getHash(key);
        if (this.buckets[hash] == null) {
            this.buckets[hash] = new LinkedList<>();
        }
        this.buckets[hash].add(new DataNode<>(key, value));
    }

    public T find (String key) {
        int hash = getHash(key);
        if (this.buckets[hash] == null) return null;
        DataNode[] data = new DataNode[this.buckets[hash].size()];
        for (DataNode d : this.buckets[hash].toArray(data)) {
            if (d.key.equals(key)) return (T)d.data;
        }
        return null;
    }

    public boolean contains (String key) {
        int hash = getHash(key);
        if (this.buckets[hash] == null) return false;
        DataNode[] data = new DataNode[this.buckets[hash].size()];
        for (DataNode d : this.buckets[hash].toArray(data)) {
            if (d.key.equals(key)) return true;
        }
        return false;
    }

    public static List<List> leftJoin (HashTable leftTable, HashTable rightTable) {
        List<List> joins = new ArrayList<>();
        for (int i = 0; i < leftTable.buckets.length; i++) {
            if (leftTable.buckets[i] != null) {
                List<Object> innerList = new ArrayList<>();
                DataNode[] dArr = new DataNode[leftTable.buckets[i].size()];
                for (Object data : leftTable.buckets[i].toArray(dArr)){
                    DataNode dNode = (DataNode) data;
                    innerList.add(dNode.key);
                    innerList.add(dNode.data);
                    innerList.add(rightTable.find(dNode.key));
                }
                joins.add(innerList);
            }
        }
        return joins;
    }




}
