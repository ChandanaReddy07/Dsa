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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null){
            return new TreeNode(val);
        }
        
        search( root, val);
        
        return root; 
        
    }
    
    public void search(TreeNode root, int val){
         
        if(root.val<val){
    
              if(root.right==null){
              TreeNode x=new TreeNode(val);
                  root.right=x;
                  return;
        }
            search(root.right,val);
        }
        else{
             if(root.left==null){
              TreeNode x=new TreeNode(val);
                  root.left=x;
                 return ;
        }
             search(root.left,val);
       
    }
    
}
}