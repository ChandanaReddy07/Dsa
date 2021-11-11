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
    public TreeNode invertTree(TreeNode root) {
       
       invertTree2(root);
        
        return root;
     
         
    }
     public void invertTree2(TreeNode root) {   
        //swaping aaa
         
         if (root==null){
             return ;
         }
         
        TreeNode x= root.left;
        root.left=root.right;   
        root.right=x;
        invertTree2(root.left);
        invertTree2(root.right);
        
         
    }
}