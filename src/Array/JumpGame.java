package Array;

public class JumpGame {
    public static void main(String[] args) {
        Jump jump = new Jump();
        int[] arr = {4,2,3,0,3,1,2};
        int start = 5;
        System.out.println(jump.canReach(arr,start));
    }
    //
}
class Jump {
    boolean checkZero=false;
    public boolean canReach(int[] arr, int start) {
        System.out.println(start);
        if(start> arr.length || start <0){
            return false;
        }
        if(arr[start]==0){
            checkZero=true;
            return true;
        }
        canReach(arr,arr[start]+start);
        //4-0,2-1,3-2,0-3,3-4,1-5,2-6
        canReach(arr,start-arr[start]);
        return checkZero;
    }
}
