package Trees;

import java.util.Scanner;

public class InsertNodeBST {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val= val;
            this.left = null;
            this.right = null;
        }
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

    public static void inOrder(TreeNode root){
        if (root == null)return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(15);


        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.right = node5;

        while (true) {
            System.out.println("Enter the number want to insert in the BST (-1 to stop): ");
            int insert = sc.nextInt();

            if (insert == -1)break;

            insertNode(root, insert);
        }

        System.out.println("The result is: ");
        inOrder(root);
    }
}
