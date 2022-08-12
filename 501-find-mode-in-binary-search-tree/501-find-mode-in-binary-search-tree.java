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
    int max;
    int count;
    TreeNode prev;
    public int[] findMode(TreeNode root) {
        count = 1;
        max = -1;
        List<Integer> al = new ArrayList<>();
        prev = null;
        inOrder(root, al);
        int n = al.size();
        int [] arr = new int[n];
        int i = 0;
        while(i < n){
            arr[i] = al.get(i);
            i++;
        }
        return arr;
    }
    private void inOrder(TreeNode curr, List<Integer> list){
        if(curr == null)    return;
        inOrder(curr.left, list);
        if(prev != null && prev.val == curr.val){
            count++;
        } else {
            count = 1;
        }
        if(max == count){
            list.add(curr.val);
        }
        if(max < count){
            max = count;
            list.clear();
            list.add(curr.val);
        }
        prev = curr;
        inOrder(curr.right, list);
    }

}