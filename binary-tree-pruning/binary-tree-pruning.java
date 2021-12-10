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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null)
            return null;
        if(root.right==null && root.left==null){
            return root.val==0?null:root;
        }
        root.left=pruneTree(root.left);
        root.right=pruneTree(root.right);
        
        if(root.val==1 || root.right!=null ||root.left!=null)         {
            return root;
            
        }
        return null;
    }
}