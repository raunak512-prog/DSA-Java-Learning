package Trees;

import  java.util.LinkedList;
import  java.util.Queue;

public class LevelOrderTraversal {
    static class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static void levelOrder(TreeNode root){

        if (root == null)return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); // enqueue

        while (!q.isEmpty()){
            TreeNode current = q.poll();// dequeue
            System.out.print(current.val + " ");

            if (current.left != null){
                q.offer(current.left);
            }

            if (current.right != null){
                q.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(30);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        System.out.println("Level Order Traversal: ");

        levelOrder(root);
    }
}
