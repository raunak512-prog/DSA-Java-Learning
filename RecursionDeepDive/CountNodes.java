package RecursionDeepDive;

public class CountNodes {
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

    int CountDepth(TreeNode root){
        if (root == null)return 0;

        int left = CountDepth(root.left);
        int right = CountDepth(root.right);

        return 1 + left + right;
    }

    public static void main(String[] args) {
        CountNodes dc = new CountNodes();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int result = dc.CountDepth(root);
        System.out.println("Total Nodes in the tree is: " + result);
    }
}
