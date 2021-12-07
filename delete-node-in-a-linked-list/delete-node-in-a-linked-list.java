/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        if(node.next==null){
            node=null;
        }
        
        node.val=node.next.val;      
            
        if(node.next.next!=null)
        node.next=node.next.next;
        else
            node.next=null;
        // while(node.next != null){
        //     node.val = node.next.val;
        //     prev = node;
        //     node = node.next;
        // }
       // prev.next = null;
    
    }
}