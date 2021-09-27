package Heap;

public class HeapRevisit {
    int[] heap;
    int heapSize ;
    int heapCapacity;

    public HeapRevisit(int heapCapacity){
        this.heapCapacity = heapCapacity;
        heapSize=0;
        heap = new int[heapCapacity];
    }
    public int left(int index){
        return 2*index + 2;
    }
    public int right(int index){
        return 2*index + 1;
    }
    public int parent(int index){
        return (index-1)/2;
    }

    //Insert Function
    public void insert(int value){
        if(heapSize==heapCapacity)
            return;

        heapSize++;
        heap[heapSize]=value;
        int index = heapSize;

        while (index!=0 && heap[parent(index)] > heap[index]){
            int temp = heap[parent(index)];
            heap[parent(index)]=heap[index];
            heap[index]=temp;

            index=parent(index);
        }
    }
    // this function basically takes in an index argument and that arg's location is the place where heap is distorted , and it improves that distorted position
    public void heapify(int indexToHeapify){

        int left=left(indexToHeapify);
        int right=right(indexToHeapify);
        int smallest=indexToHeapify;

        if(left < heapSize && heap[smallest] > heap[left] ){
            smallest=left;
        }
        if(right < heapSize && heap[smallest] > heap[right]){
            smallest=right;
        }
        if(smallest!=indexToHeapify){
            int temp = heap[indexToHeapify];
            heap[indexToHeapify]=heap[smallest];
            heap[smallest]=temp;

            heapify(smallest);
        }
    }

    public int extractMin(){
        if(heapSize==0)
            return Integer.MIN_VALUE;
        if(heapSize==1)
            return heap[heapSize];

        int temp = heap[0];
        heap[0]=heap[heapSize];
        heap[heapSize]=temp;

        heapSize--;
        heapify(0);

        return heap[heapSize];
    }

    public void decreaseKey(int newValue , int indexOfThatValue){
        heap[indexOfThatValue] = newValue;
        while (heap[indexOfThatValue] < heap[parent(indexOfThatValue)] && indexOfThatValue!=0){
            int temp = heap[indexOfThatValue];
            heap[indexOfThatValue]=heap[parent(indexOfThatValue)];
            heap[indexOfThatValue]=temp;

            indexOfThatValue = parent(indexOfThatValue);
        }
    }

    public void delete(int indexToDelete){
        decreaseKey(Integer.MIN_VALUE,indexToDelete);
        extractMin();
    }

}