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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int counterLeft = 0, counterRight = 0;
        if(root.left != null){
            counterLeft = maxDepth(root.left);
        }
        if(root.right != null){
            counterRight = maxDepth(root.right);
        }
        return Math.max(counterLeft,counterRight) + 1;
    }
}
