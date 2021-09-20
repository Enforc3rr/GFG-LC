package Trees;

import java.util.LinkedList;
import java.util.Queue;
class Node {
    public int key;
    public Node left;
    public Node right;
    public Node(int key){
        this.key = key;
    }
}
public class Tree {
    public static void main(String[] args) {
        Node newNode= new Node(10);
        newNode.left = new Node(20);
        newNode.right = new Node(30);
        newNode.left.left = new Node(40);
        newNode.left.right = new Node(50);
        newNode.right.left = new Node(60);
        Tree tree = new Tree();
//        tree.inOrder(newNode);
//        System.out.println();
//        System.out.println( tree.height(newNode));
//        tree.distanceK(newNode,1);

//        tree.bfs(newNode);
//        tree.sizeOfBinaryTree(newNode);
//        System.out.println(tree.sizeOfBinaryTreeRec(newNode));
        tree.maxInBTree(newNode);
        System.out.println(tree.maxInBTreeRec(newNode));
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }
    public void preOrder(Node root){
        if(root!=null){
            System.out.println(root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key);
        }
    }
    public int height(Node root){
        if(root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }

    // Distance from 0 to k units.
    public void distanceK(Node root , int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.key);
        }
        else {
            distanceK(root.left,k-1);
            distanceK(root.right,k-1);
        }
    }


    //Always Remember we use queue in BFS and Stack in DFS
    public void bfs(Node root){
        if(root==null) return;
        Queue<Node> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        while(!treeQueue.isEmpty()){
            Node current = treeQueue.poll();
            System.out.println(current.key);
            if(current.left!= null)
                treeQueue.add(current.left);
            if(current.right!= null)
                treeQueue.add(current.right);
        }
    }
    public void sizeOfBinaryTree(Node root){
        if(root==null) return;
        Queue<Node> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        int count=0;
        while(!treeQueue.isEmpty()){
            Node current = treeQueue.poll();
            count++;
            if(current.left!= null)
                treeQueue.add(current.left);
            if(current.right!= null)
                treeQueue.add(current.right);
        }
        System.out.println(count);
    }
    public int sizeOfBinaryTreeRec(Node root){
        if(root==null) return 0;
        else
            //we are just adding one inorder to take in the count of root node.
            return sizeOfBinaryTreeRec(root.left) + sizeOfBinaryTreeRec(root.right) + 1;
    }

    public void maxInBTree(Node root){
        int max = 0 ;
        Queue<Node> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        while (!(treeQueue.isEmpty())){
            Node current = treeQueue.poll();
            if(current.key > max)
                max = current.key;
            if(current.left!=null)
                treeQueue.add(current.left);
            if(current.right!=null)
                treeQueue.add(current.right);
        }
        System.out.println(max);
    }
    public int maxInBTreeRec(Node root){
        if(root == null)
            return Integer.MIN_VALUE ;
        else
            return Math.max(root.key , Math.max(maxInBTreeRec(root.left),maxInBTreeRec(root.right)));
    }
}
