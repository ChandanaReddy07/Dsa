/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
//           if(root==null){
//             return null;
//         }
//        if(root.val==p.val || root.val == q.val){
//             return root ;
//         }
//           System.out.println("rootleft"+root.val);
//         TreeNode l= lowestCommonAncestor( root.left,  p,  q);
      
//            System.out.println("rootright"+root.val);
//         TreeNode r= lowestCommonAncestor( root.right,  p,  q);
        
//         if(l==null){
//              System.out.println("lnull"+root.val);
//              // System.out.println("r"+r.val);
//             return r;
//         }
//         if(r==null){
//              System.out.println("rnull"+root.val);
//           //  System.out.println("l"+l.val);
//             return l;
//         }
        
       
//         return root;
    
//     }
// }



   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
       
       
       while(root!=null){
           
          // System.out.println("lol"+p.val+"pol"+q.val);
           if(root.val==p.val || root.val==q.val || (root.val>p.val && root.val<q.val)|| (root.val<p.val && root.val>q.val)){
               return root;
           }
           else if(root.val>p.val||root.val>q.val){
               root=root.left;
           }
           else if(root.val<p.val||root.val<q.val){
               root=root.right;
           }
           
       }
       
       return root;
       
   }

}