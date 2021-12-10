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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null){
            return true;
        }
         if(p==null || q==null){
            return false;
        }
        
        
        if(p.val != q.val){
            return false;
        }
        
       return isSameTree(p.left,q.left) && isSameTree(p.right,q.right)  ;
        
        
        
        // through iteration
//         Stack<TreeNode> stck1=new Stack<TreeNode>();
//         Stack<TreeNode> stck2=new Stack<TreeNode>();
        
       
//         stck1.push(p);
        
//         stck2.push(q);
       
//         while(!stck1.isEmpty() && !stck2.isEmpty()){
            
//             TreeNode curr1= stck1.pop();
//             TreeNode curr2= stck2.pop();
           
//             if(curr1.val!=curr2.val){
//                 return false;
//             }
            
//             if(curr1.right!=null){
//                 if(curr2.right==null)
//                     return false;
//                 else
//                 stck2.push(curr2.right);
//                 stck1.push(curr1.right);
                
//             }
//             else if(curr2.right!=null){
//                 return false;
//             }
            
//              if(curr1.left!=null){
//                 if(curr2.left==null)
//                     return false;
//                 else
//                 stck2.push(curr2.left);
//                 stck1.push(curr1.left);
                
//             }
//             else if(curr2.left!=null){
//                 return false;
//             }
            
//         }
        
//         return true;
        
    }
}