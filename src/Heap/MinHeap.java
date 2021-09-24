package Heap;

import java.util.PriorityQueue;

public class MinHeap {
    int [] array;
    int size ;
    int capacity ;
    public MinHeap(){};

    public MinHeap(int c){
        array = new int[c];
        size = 0;
        capacity = c;
    }
    public int left(int i){
        return (2*i)+1;
    }
    public int right(int i){
        return (2*i)+2;
    }
    public int parent(int i){
        return (i-1)/2;
    }

    public void insert(int key){
        if(size==capacity) return;
        size++;
        array[size-1]=key;
        int i = size-1;
        while (i!=0 && array[parent(i)] > array[i]){

            // Swap
            int temp = array[parent(i)];
            array[parent(i)] = array[i];
            array[i] = temp;

            i=parent(i);
        }
    }

    /*
    Heapify is basically the subroutine that is used in extracting minimum number and Get Min Number.
    Worst Case : O(h) : where h is the height
    Best Case : O(1)
     */
    public void heapify(int index){
        int left = left(index); int right = right(index); int smallest = index;

        if(left < size && array[left] < array[index])
            smallest = left;

        if(right < size && array[right] < array[smallest])
            smallest = right;

        if(smallest != index){
            int temp = array[index];
            array[index] = array[smallest];
            array[smallest] = temp;

            heapify(smallest);
        }
    }
    /*
        1) Swap the first element with the last element
        2) Reduce size by 1
        3) then simply heapify

     */
    public int extractMin(){
        if(size==0) return Integer.MAX_VALUE;
        if(size==1) {
            System.out.println(array[size]);
        }

        int temp = array[size];
        array[size] = array[0];
        array[0] = temp;

        System.out.println(array[size]);
        size--;

        heapify(0);

        return array[size];
    }
    /*


     */

    public void decreaseKey(int[] heap , int newValue , int indexOfOldValue){
        heap[indexOfOldValue] = newValue;

        while (indexOfOldValue!=0 && heap[parent(indexOfOldValue)] > heap[indexOfOldValue]){
            int temp = array[indexOfOldValue];
            array[indexOfOldValue]=array[parent(indexOfOldValue)];
            array[parent(indexOfOldValue)] = temp;

            indexOfOldValue = parent(indexOfOldValue);
        }
    }

    public void delete(int indexToDelete,int[] heap){
        decreaseKey(heap,Integer.MIN_VALUE,indexToDelete);
        extractMin();
    }

    public void buildHeap(int[] normalArray){
        for(int i = (size-2)/2 ; i >= 0 ; i--){
            heapify(i);
        }
    }
    // It's internal is basically MinHeap DS
    public void usingPriorityQueue(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder); For Max Heap
        priorityQueue.add(10);
        priorityQueue.add(4);
        priorityQueue.add(40);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek()); // gives us top value
        System.out.println(priorityQueue.poll()); // removes the top value
        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue);
    }
}
