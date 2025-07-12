package Trees;

public class CountLeafNodes {
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

    public static int countLeaf(TreeNode root){

        if (root == null) return 0;

        if (root.left == null && root.right == null) return 1;

        int leftLeaves = countLeaf(root.left);
        int rightLeaves = countLeaf(root.right);

        return leftLeaves + rightLeaves;
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

        int result = countLeaf(root);
        System.out.println("The total number of leaf Nodes are: " + result);
    }
}
