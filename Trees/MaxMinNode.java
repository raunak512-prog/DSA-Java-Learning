package Trees;

public class MaxMinNode {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int maxNode(TreeNode root){
        if (root == null)return Integer.MIN_VALUE; //For max

        int leftMax = maxNode(root.left);
        int rightMax = maxNode(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static int minNode(TreeNode root){
        if (root == null)return Integer.MAX_VALUE;//For min

        int leftMin = minNode(root.left);
        int rightMin = minNode(root.right);

        return Math.min(root.val, Math.min(leftMin, rightMin));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(30);
        TreeNode node6 = new TreeNode(23);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.right = node5;
        node2.right.left = node6;

        int result1 = maxNode(root);
        System.out.println("The maximum number of the node is: " + result1);

        int result2 = minNode(root);
        System.out.println("The minimum number of the node is: " + result2);

    }
}
