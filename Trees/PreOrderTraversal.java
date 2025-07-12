package Trees;

public class PreOrderTraversal {
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

    public static void preOrder(TreeNode root){
        if (root == null)return;

        // step 1: visit root.
        System.out.print(root.val + " ");

        // step 2: Traverse left subtree.
        preOrder(root.left);

        // step 3: Traverse right subtree.
        preOrder(root.right);
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

        System.out.println("Preorder Traversal: ");
        preOrder(root);
    }
}
