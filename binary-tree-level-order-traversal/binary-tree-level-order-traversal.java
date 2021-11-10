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
  
   public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> resultSet = new ArrayList<>();
		List<Integer> levelSet = new ArrayList<>();

		if(root == null)
			return resultSet;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		TreeNode temp;
		int size;

		while(!queue.isEmpty()){
			size = queue.size();

			levelSet = new ArrayList<>();
			for(int i=0 ; i<size ; i++){

				temp = queue.poll();
				levelSet.add(temp.val);
				if(temp.left != null)
					queue.add(temp.left);
				if(temp.right != null)
					queue.add(temp.right);

			}

			resultSet.add(levelSet);
		}
		return resultSet;
	}

}