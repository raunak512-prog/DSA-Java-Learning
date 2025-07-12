package Trees;

public class DiameterBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static int diameter = 0;

    public static int height(TreeNode root){
        if (root == null)return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int getDiameter(TreeNode root){
        diameter = 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = getDiameter(root);

        System.out.println("The diameter of the tree is: " + result);
    }
}
