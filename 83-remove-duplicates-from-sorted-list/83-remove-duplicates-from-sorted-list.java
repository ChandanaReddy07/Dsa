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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode c=head.next;
        
        while(c != null){
           
           if(p.val==c.val){
               p.next=c.next;
               c=c.next;
           }
            else{
                 p=c;
                c=p.next;
                 
            }
         
            
        }
        return head;
 /*        ListNode prev=head;
         ListNode curr=head.next;
        while(prev.next != null){
            curr= prev.next;
           
            if(prev.val == curr.val){
                prev=curr.next;
            }
              prev= prev.next;
            
        }*/
     //   return prev;
        
        
    }
}