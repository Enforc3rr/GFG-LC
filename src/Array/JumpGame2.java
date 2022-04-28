package Array;

public class JumpGame2 {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));//
    }
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] visited = new boolean[len];
        return func(nums,0,len,visited);
    }
    public static boolean func(int[] nums , int nextIndex , int len , boolean[] visited){
        if(nextIndex == len-1)
            return true;
        if(nextIndex >= len)
            return false;
        if(nums[nextIndex]==0 && nextIndex != len -1  )
            return false;
        boolean returnType = false;
        int currentVal = nums[nextIndex];
        for(int i = nextIndex+1 ; i <= nextIndex+currentVal ; i++){
            if (func(nums, i,len,visited)) {
                returnType = true;
                break;
            }
        }
        return returnType;
    }
}
