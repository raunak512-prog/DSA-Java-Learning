package RecursionDeepDive;

public class SumOfAllNodes {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    int SumNode(TreeNode root){
        if (root == null)return 0;

        int leftsum = SumNode(root.left);
        int rightsum = SumNode(root.right);

        return leftsum + rightsum + root.val;
    }

    public static void main(String[] args) {
        SumOfAllNodes dc = new SumOfAllNodes();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int result = dc.SumNode(root);
        System.out.println("Sum of the Nodes in the tree is: " + result);
    }
}
