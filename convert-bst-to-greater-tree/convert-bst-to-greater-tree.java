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
 int currSum = 0;
public TreeNode convertBST(TreeNode root) {
    if(root == null) return root;
    
    convertBST(root.right); 
    
    currSum += root.val;
    
    root.val = currSum;
    
    convertBST(root.left);
    
    return root;
}
}