package Map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class LRUCache {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>(2);
        Queue<Integer> queue = new LinkedList<Integer>();
        hashMap.put(2,6);
        queue.add(2);
        hashMap.put(1,5);
        queue.add(1);

        hashMap.put(1,2);
        queue.add(1);

        System.out.println(hashMap);

    }
}
class LRU {
    HashMap<Integer , Integer> hashMap ;
    Queue<Integer> queue ;
    int capacity ;
    public LRU(int capacity) {
        hashMap = new HashMap<>(capacity);
        queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(hashMap.get(key)==null){
            return -1;
        }else{
            queue.remove(key);
            queue.add(key);
            return hashMap.get(key);
        }
    }
    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            hashMap.replace(key,value);
            queue.remove(key);
            queue.add(key);
        }else{
            if(hashMap.size()==capacity){
                hashMap.remove(queue.remove());
                hashMap.put(key,value);
                queue.add(key);
            }else{
                queue.add(key);
                hashMap.put(key,value);
            }
        }
    }
}
