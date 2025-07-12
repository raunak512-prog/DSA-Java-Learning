package Trees;

import java.util.Scanner;

public class SearchValueBST {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    boolean search(TreeNode root, int target){
        if (root == null){
            System.out.println("Oops! The value is not found. ");
            return false;
        }
        if (root.val == target){
            System.out.println("Yes! The value is found. ");
            return true;
        }
        if (target < root.val){
            return search(root.left, target);
        }
        else {
            return search(root.right, target);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SearchValueBST pq = new SearchValueBST();

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

        System.out.println("Enter the value you want to search in the BST: ");
        int target = sc.nextInt();

        pq.search(root, target);

    }
}
