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
        
        if(root==null){
            return 0;
        }
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int vals = height(root.left) +height(root.right)+2;
        
        int res = Math.max(vals,Math.max(left,right));
        return res;
        
    }
    public int height(TreeNode node){
        if(node==null){
            return -1;
        }
        int a = height(node.left);
        int b = height(node.right);
        int c = Math.max(a,b)+1;
        return c;
    }
}