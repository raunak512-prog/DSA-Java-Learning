package Trees;

import java.util.Scanner;

public class LowestCommonAncestor {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
        if (root == null)return null;

        if (root == p || root == q)return root;

        TreeNode leftLCA = findLCA(root.left, p, q);
        TreeNode rightLCA = findLCA(root.right, p, q);

        if (leftLCA != null && rightLCA != null){
            return root;
        }

        return (leftLCA != null)? leftLCA: rightLCA;
    }

    public static void main(String[] args) {

        LowestCommonAncestor tree = new LowestCommonAncestor();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode lca = tree.findLCA(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
