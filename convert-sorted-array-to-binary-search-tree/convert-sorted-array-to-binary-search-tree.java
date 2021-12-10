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
  
public TreeNode sortedArrayToBST(int[] nums) {
    
    return constructBST(nums,0,nums.length-1);
    

}
public static TreeNode constructBST(int arr[],int low,int high)
{
    if(low>high)
        return null;

     int mid=(low+high)/2;
     int data=arr[mid];
     TreeNode lc=constructBST(arr,low,mid-1);
     TreeNode rc=constructBST(arr,mid+1,high);
     TreeNode node =new TreeNode(data,lc,rc);
     return node;
}
}