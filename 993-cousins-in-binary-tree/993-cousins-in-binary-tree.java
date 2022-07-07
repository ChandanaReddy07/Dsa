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
    
    TreeNode xp;
    TreeNode yp;
    
    int xheight;
    int yheight;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root,x,y,0,null);
        
        if(xheight==yheight && xp!=yp ){
            return true;
        }
       
        return false;
        
        
    }
    
    public void helper(TreeNode root, int x, int y,int height,TreeNode prev)
    {
        if(root==null) return ;
        
        if(root.val==x) {
            xp = prev;
            xheight = height;
        }
        if(root.val==y){
            yp = prev;
            yheight = height;
        }
        prev = root;
        helper(root.left, x, y, height+1, prev);
        helper(root.right,x, y, height+1, prev); 
    }
}