package Array;



public class MaxBinaryTree {
    public static void main(String[] args) {

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return maxNumber(nums,0,nums.length-1);
    }
    public TreeNode maxNumber(int[] nums,int start,int end){
        if(start < end){
            TreeNode tree = new TreeNode();
            int maxNumberIndex = -1;
            int maxNumber = Integer.MIN_VALUE;
            for(int i = start ; i < end ; i++){
                if(nums[i]>maxNumber){
                    maxNumber = nums[i];
                    maxNumberIndex = i ;
                }
            }
            tree.val = maxNumber;
            tree.left = maxNumber(nums,start,maxNumberIndex-1);
            tree.right = maxNumber(nums,maxNumberIndex+1,end);
            return tree;
        }
        return null;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

