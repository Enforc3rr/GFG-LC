package BST;

import java.util.ArrayList;

public class CountGoodNode {
    public static void main(String[] args) {

    }
    int countGoodNode = 0 ;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        checkGoodNode(root,root);
        return countGoodNode;
    }

    private void checkGoodNode(TreeNode rootNode , TreeNode node){
        if(node==null){
            return;
        }
        if(rootNode.val<=node.val){
            rootNode = node;
            countGoodNode++;
        }
        checkGoodNode(rootNode,node.left);
        checkGoodNode(rootNode,node.right);
    }
}
