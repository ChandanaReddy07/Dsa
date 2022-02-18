package Trees;
// public class TreeNode {
//          int val;
//          TreeNode left;
//          TreeNode right;
//          TreeNode() {}
//          TreeNode(int val) { this.val = val; }
//          TreeNode(int val, TreeNode left, TreeNode right) {
//              this.val = val;
//              this.left = left;
//              this.right = right;
//          }
//      }
public class heigthoftree {
    class Solution {
        public int maxDepth(TreeNode root) {
            
            int  h_left,h_right;
            
            if(root==null){
                return 0;
            }
            h_left=maxDepth(root.left);
            
            h_right=maxDepth(root.right);
            
            if(h_left>h_right){
                return 1+h_left;
            }
            else
                return 1+h_right;
            
        }
    }
    
}
