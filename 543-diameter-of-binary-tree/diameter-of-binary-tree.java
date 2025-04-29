/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        depth(root,diameter);
        return diameter[0];
    }
    public int depth(TreeNode root,int[] diameter) {
        if(root == null) return 0;
        int ln = depth(root.left,diameter);
        int rn = depth(root.right,diameter);
        diameter[0] = Math.max(diameter[0],ln + rn);
        return 1 + Math.max(ln,rn);
    }
}