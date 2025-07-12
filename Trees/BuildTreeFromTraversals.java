package Trees;

import java.util.HashMap;
import java.util.Scanner;

public class BuildTreeFromTraversals {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static int preIndex = 0;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // Build a map to store value -> index for quick lookup in inorder
        HashMap<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return construct(preorder, 0, inorder.length - 1, inorderMap);
    }

    private static TreeNode construct(int[] preorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if (inStart > inEnd) return null;

        // Pick current root from preorder
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // If it's a leaf node (no subtree)
        if (inStart == inEnd) return root;

        // Find index of root in inorder to split left/right
        int inIndex = map.get(rootVal);

        // Build left and right subtree recursively
        root.left = construct(preorder, inStart, inIndex - 1, map);
        root.right = construct(preorder, inIndex + 1, inEnd, map);

        return root;
    }

    // Utility: Inorder Print to Verify Tree
    public static void printInOrder(TreeNode root) {
        if (root == null) return;

        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int [] preorder = new int[size];
        int[] inorder = new int[size];

        System.out.println("Enter the "+ size+ " elements for Preorder: ");
        for (int i = 0; i < size; i++){
            preorder[i] = sc.nextInt();
        }

        System.out.println("Enter the " + size + " elements for the Inorder: ");
        for (int j = 0; j < size; j++){
            inorder[j] = sc.nextInt();
        }
        TreeNode root = buildTree(preorder, inorder);

        System.out.println("Constructed Tree Inorder Traversal:");
        printInOrder(root);  // Should match inorder input
    }
}
