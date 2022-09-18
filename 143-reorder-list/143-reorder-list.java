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
    
        public void reorderList(ListNode head) {
            
            if(head.next==null){
                return;
            }
       
            ListNode slow=head;
            ListNode fast=head;
            ListNode pr=head;
            
            while(fast!=null && fast.next!=null){
                pr=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            
            pr.next=null;
            
            slow=reverse(slow);
         
            mergeTwoLists(head,slow);
        
    }
    
    void mergeTwoLists(ListNode head1, ListNode head2) {
      
         while(head1 != null && head2!=null) {
            ListNode newHead1 = head1.next, newHead2 = head2.next;
            head1.next = head2;
            
            if(newHead1 == null) break;

            head2.next = newHead1;
            head1 = newHead1;
            head2 = newHead2;
        }
    }
    
    ListNode reverse(ListNode headNode) {
      
        ListNode prev=null;
        ListNode curr=headNode;
        
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;    
        }  
        return prev;
    }       
}