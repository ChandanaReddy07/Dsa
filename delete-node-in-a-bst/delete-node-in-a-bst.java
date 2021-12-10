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
    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteRec( root, key);
    }
        
     public TreeNode deleteRec(TreeNode root, int key)
    {
       
        if (root == null)
            return root;
 
        if (key < root.val)
            root.left = deleteRec(root.left, key);
        else if (key > root.val)
            root.right = deleteRec(root.right, key);
 
        else {
          
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
          
            root.val = minValue(root.right);
 
            root.right = deleteRec(root.right, root.val);
        }
 
        return root;
    }
 
    int minValue(TreeNode root)
    {
        int minv = root.val;
        while (root.left != null)
        {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
    
}