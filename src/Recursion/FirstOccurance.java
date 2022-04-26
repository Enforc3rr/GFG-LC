package Recursion;


public class FirstOccurance {
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,4,1,2,3,4};
        System.out.println(firstOcc(arr,0,90));
        System.out.println(lastIndexOfOcc(arr, arr.length-1,2 ));
    }
    private static int firstOcc(int[] arr , int index , int key){
        if(index == arr.length)
            return -1;
        if(arr[index]==key)
            return index;
        else
            return firstOcc(arr,index+1,key);
    }

    private static int lastIndexOfOcc(int [] arr , int index , int key){
        if(index == -1)
            return -1;
        if(arr[index]==key)
            return index;
        else
            return lastIndexOfOcc(arr,index-1,key);
    }

    private static int lastOccApproach2(int[] arr ,int index , int key){
        if(index == arr.length)
            return -1;
        int curr = lastOccApproach2(arr,index+1,key);
        if(curr==-1){
            if(arr[index]==key)
                return index;
            else
                return -1;
        }else{
            return curr;
        }
    }

    public static int[] allIndices(int[] arr , int index , int key , int count){
        if(arr.length == index){
            return new int[count];
        }
        if(arr[index]==key){
            int[] indices = allIndices(arr,index+1,key,count+1);
            indices[count]=index;
            return indices;
        }else{
            int[] indices = allIndices(arr,index+1,key,count);
            return indices;
        }
    }
}
