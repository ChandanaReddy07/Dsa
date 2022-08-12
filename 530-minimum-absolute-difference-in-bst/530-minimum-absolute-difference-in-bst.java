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
   ArrayList<Integer> arr= new ArrayList<>();
public void inorder(TreeNode root)
{
    if(root==null)
        return;
    
    inorder(root.left);
    arr.add(root.val);
    inorder(root.right);
}
public int getMinimumDifference(TreeNode root) {
    
    if(root==null)
        return 0;
    
    inorder(root);
    
    int min=Integer.MAX_VALUE;
    
    for(int i=0 ;i<arr.size()-1 ;i++)
    {
        int temp=Math.abs(arr.get(i)-arr.get(i+1));
        
        if(temp<min)
            min=temp;
        
    }
    return min;
}
}