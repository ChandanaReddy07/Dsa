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
 public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null) {
            return helper(root.val);
        }
        
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        
         if(root.val == 2) {
             return left || right;
         }
        
        if(root.val == 3) {
           return left && right; 
        }
        return false;
        
    }
    
    
    public boolean helper(int val) {
        if(val == 1) {
            return true;
        }         
        if(val == 0) {
            return false;
        }
        return false;
    }
}