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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        
         if(root==null ||(root.left==null && root.right==null)  ){
            return 0;
        }
        
        
        return  helper(root.left,0,sum)+helper(root.right,1,sum);
    }
    
    public int helper(TreeNode root,int w,int sum){
        if(root==null){
            return sum;
        }
       else if(root.left==null && root.right==null && w==0 ){
          return  sum+root.val;
        }
        
        return helper(root.left,0,sum)+helper(root.right,1,sum);
    }
}