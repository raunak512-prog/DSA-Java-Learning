package Trees;

public class HeightOfBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightTree(TreeNode root){
        if (root == null)return 0;

        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

        return 1 + Math.max(leftHeight, rightHeight);


    }

    public static int height1tree(TreeNode root){
        if (root == null)return 0;

        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

        return 1 + Math.min(leftHeight, rightHeight);
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

        int result = heightTree(root);
        System.out.println("The max height of the tree is: " + result);

        int result1 = height1tree(root);
        System.out.println("The min height of the tree is: " + result1);
    }
}
