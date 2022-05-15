package CodeChallenges.Challenge30;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable <K,V>{

    /*
    This array used to hold the value when the collisions are occurred
    */
    private ArrayList<HashNode<K,V>> bucketArray;

    /*
    This variable will hold the current size of bucketArray
    */
    private int bucketsCounter;

    /*
    number of hash nodes in the bucketArray
    */
    private int size=0;


    public HashTable(){
        bucketArray = new ArrayList<>();
        bucketsCounter = 40;

        //create the array that will hold the nodes(bucketArray)
        for (int i = 0; i < bucketsCounter; i++) {
            bucketArray.add(null);
        }
    }

    //to hashes the key
    private int hashCode(K key){
        return Objects.hashCode(key);
    }

    //return the index from the bucketArray
    private int hash(K key){
        int hashCode = hashCode(key);

        //this formula to ensure that the index is still in the range od the bucketArray
        int index = hashCode % bucketsCounter;

        //to ensure that the hashcode is not negative
        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public void add(K key,V value){
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        HashNode<K,V> head = bucketArray.get(bucketIndex);

        //check the key if exist or not
        while (head != null){
            if (head.key.equals(key) && head.hashCode==hashCode){
                head.value = value;
                return;
            }
            head = head.next;
        }

        //add the value to its position
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K,V> newNode = new HashNode<>(key,value,hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex,newNode);

        if((1.0 * size)/bucketsCounter >=7.0){
            ArrayList<HashNode<K,V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            bucketsCounter*=2;
            size=0;

            for (int i = 0; i < bucketsCounter; i++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode:
            temp){
                while (headNode != null){
                    add(headNode.key,headNode.value);
                    headNode = headNode.next;
                }
            }
        }

    }


    public V remove(K key){

        //use hash methode to find the index for given key
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        //get the head of list
        HashNode<K,V> head = bucketArray.get(bucketIndex);

        //search the key in its linked list
        HashNode<K,V> prev = null;
        while (head != null){
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;
            prev  = head;
            head  = head.next;
        }
        if (head == null)
            return null;

        size--;

        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex,head.next);

        return head.value;
    }

    public V get(K key){
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if (head.key.equals(key) && hashCode == head.hashCode)
                return head.value;
            head = head.next;
        }
        return null;
    }

    public boolean contain(K key){

        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if (head.key.equals(key) && hashCode == head.hashCode)
                return true;
            head = head.next;
        }
        return false;

    }

    public ArrayList keys() {
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < bucketArray.size(); i++) {
            HashNode<K, V> head = bucketArray.get(i);
            while (head != null) {
                keys.add(head.key);
                head = head.next;
            }

        }
        return keys;
    }

    public ArrayList values() {
        ArrayList<V> values = new ArrayList<>();
        for (HashNode<K, V> head : bucketArray) {
            while (head != null) {
                values.add(head.value);
                head = head.next;
            }

        }
        return values;
    }

}





























