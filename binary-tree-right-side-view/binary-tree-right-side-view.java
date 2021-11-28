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
    
     int max_level = 0;
    
    public List<Integer> rightSideView(TreeNode root) {
          ArrayList<Integer> a = new ArrayList<Integer>();
          util( root,  1,  a);
          return a;
    }
      
   
     void util(TreeNode node, int level, ArrayList<Integer> a)
    {
        
        if (node == null)
            return;
 
        if (max_level < level) {
            a.add(node.val);
            max_level = level;
        }
 
        util(node.right, level + 1,a);
        util(node.left, level + 1,a);
    }
}