/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        
        if(head.next==null){
            return head;
        }
        
        ListNode x=head;
        ListNode y=head.next.next;
        while(y!=null && y.next!=null){
            x=x.next;
            y=y.next.next;
        }
        
        
      
        
        return x.next;
    
    }
        
}