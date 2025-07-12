package Trees;

public class BalancedBinaryTreeCheck {
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

        int left = heightTree(root.left);
        int right = heightTree(root.right);

        return 1 + Math.max(left, right);
    }


    public static boolean isBalanced(TreeNode root){
        if (root == null)return true;

        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) // Math.abs gives absolute (positive) value of a number — no matter if it's negative or positive.
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        node1.left = node3;

        System.out.print(isBalanced(root));
    }
}
