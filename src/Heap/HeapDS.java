package Heap;

public class HeapDS {
    /*
        Binary Heap is a complete Binary Tree ( as it is stored in  an array )
        left child (i) : 2*i + 1
        right child  (i) : 2*i + 2
        parent  (i) : | (i - 1)/ 2 |

        Heap is of Two Types :
            1) Min Heap -> The Highest Priority Item is assigned the lowest value. ( like root's value is lowest )
                * Complete Binary Tree
                * Every Node has value smaller than the ones below it.
            2) Max Heap -> The Highest Priority Item is assigned the highest value. ( like root's value is lowest )

    */
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.usingPriorityQueue();
    }
}
