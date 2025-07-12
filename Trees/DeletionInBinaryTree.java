package Trees;

import java.util.Scanner;

public class DeletionInBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static TreeNode findMin(TreeNode root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }


    public static TreeNode insertNode(TreeNode root, int val){
        if (root == null)return new TreeNode(val);

        if (val < root.val){
            root.left = insertNode(root.left, val);
        }
        else {
            root.right = insertNode(root.right,  val);
        }
        return root;
    }

    public static TreeNode deleteBst(TreeNode root, int val){
        if (root == null)return null;

        if (val < root.val)
            root.left = deleteBst(root.left, val);
        else if (val > root.val) {
            root.right = deleteBst(root.right, val);
        }
        else {
            // Node found
            // Case 1: no child
            if (root.left == null && root.right == null)return null;

            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteBst(root.right, successor.val);
        }
        return root;
    }

    public static void inOrder(TreeNode root){
        if (root == null)return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeletionInBinaryTree ws = new DeletionInBinaryTree();

        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(15);
        TreeNode node6 = new TreeNode(23);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.right = node5;

        System.out.println("The predefined list before insertion is: ");
        inOrder(root);
        System.out.println("\n");

        while (true) {
            System.out.println("Enter the number you want to insert (-1 to exit) : ");
            int insert = sc.nextInt();

            if (insert == -1)break;
            insertNode(root, insert);
        }

        System.out.println("The list after insertion is: ");
        inOrder(root);
        System.out.println("\n");

        System.out.println("Enter the number you want to delete from the list: ");
        inOrder(root);
        int del = sc.nextInt();

        deleteBst(root, del);

        System.out.println("✅ Node " + del + " deleted successfully.");
        inOrder(root);
    }
}
