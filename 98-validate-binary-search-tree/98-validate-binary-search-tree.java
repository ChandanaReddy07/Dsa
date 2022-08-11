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
  public boolean isValidBST(TreeNode root) {

            
            return check(root,null,null);
            
        }
    

     public boolean check(TreeNode root,TreeNode mini,TreeNode maxi) {
            
            if(root==null){
                return true;
            }
            
            if((mini!=null && root.val<=mini.val)||(maxi!=null && root.val>=maxi.val)){
                return false;
            }
    
               return check(root.left,mini,root)&&check(root.right,root,maxi);  
               }
}