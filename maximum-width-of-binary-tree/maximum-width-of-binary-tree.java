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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        
        Queue<TreeNode>queue = new LinkedList<>();
        HashMap<TreeNode, Integer>map = new HashMap<>();
        
        queue.add(root);
        map.put(root, 0);
        
        int min=0, max=0;
        int maxwidth = 0;
        
        while(!queue.isEmpty())
        {
            int size = queue.size();
            
            for(int i=0;i<size;i++){          
                TreeNode node = queue.poll();
                
                if(i==0)
                    min = map.get(node);
              
                if(i==size-1)
                    max = map.get(node);
                    
                if(node.left!=null){
                    queue.add(node.left);
                    map.put(node.left, 2*map.get(node));
                }
                
                if(node.right!=null){
                    queue.add(node.right);
                    map.put(node.right, 2*map.get(node) + 1);
                }                              
                map.remove(node);
            }    
            maxwidth = Math.max(maxwidth, max-min+1);
        }
        return maxwidth;
    
        
    }
}