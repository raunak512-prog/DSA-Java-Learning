package RecursionDeepDive;

public class InsertIntoBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode insert(TreeNode root, int val){
        if (root == null){
            return new TreeNode(val);
        }

        if (val < root.val){
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        InsertIntoBST tree = new InsertIntoBST();

        TreeNode root = null;

        root = tree.insert(root, 5);
        root = tree.insert(root, 3);
        root = tree.insert(root, 8);
        root = tree.insert(root, 2);
        root = tree.insert(root, 4);
        root = tree.insert(root, 6);
        root = tree.insert(root, 10);

        System.out.println("Inorder Traversal of BST:");
        tree.inorder(root);
    }
}