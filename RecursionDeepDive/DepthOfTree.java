package RecursionDeepDive;
public class DepthOfTree {
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


    int maxDepth(TreeNode root){
        if (root == null)return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left,  right);
    }

    public static void main(String[] args) {
        DepthOfTree dc = new DepthOfTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int result = dc.maxDepth(root);
        System.out.println("Maximum Depth of the Tree: " + result);
    }

}
