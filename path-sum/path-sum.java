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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return sum1(root,0,targetSum);
        
    }
  
    public boolean sum1(TreeNode root,int currsum,int t){
        
        if(root==null)
            return false;
          if(root.left==null && root.right==null)
        {
            currsum += root.val;
            return currsum == t;
        }
        
         return sum1(root.left, currsum + root.val, t) || sum1(root.right, currsum + root.val, t);
      
    }
    
   
}