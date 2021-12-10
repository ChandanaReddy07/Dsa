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
// int counter=0;
//     public int kthSmallest(TreeNode root, int k) {
       
//         return helper(root,k);       
//     }
//   public int helper(TreeNode root, int k){
      
//       if(root==null)
//             return -1;
        
//         int left = helper(root.left,k);
        
//         if(left!=-1)
//                  return left;
 
//            counter++;
        
//         if(k==counter)
//             return root.val;
        
//         int right= helper(root.right,k);
        
//         return right;
//   }
int i = 0;
Integer fin = null;

public int kthSmallest(TreeNode root, int k) {
    traverse(root,k);
    return fin;
}

//inorder traverse
public void traverse(TreeNode root, int k)
{
    if(root != null )
    {
        traverse(root.left,k);
        i++;
        if(i == k) fin = root.val;
        traverse(root.right,k);
    }
   
}

}