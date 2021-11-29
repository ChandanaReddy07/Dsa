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
     int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		maxDiameterOfBinaryTree(root);
		return max-1;
	}

	public int maxDiameterOfBinaryTree(TreeNode root) {
		if(root == null)
			return 0;

		int leftChild = maxDiameterOfBinaryTree(root.left);
		int rightChild = maxDiameterOfBinaryTree(root.right);

		max = Math.max(max , leftChild+rightChild+1);

		return Math.max(leftChild , rightChild) + 1;
	}
}