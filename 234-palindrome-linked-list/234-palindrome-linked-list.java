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
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null){
            return true;
        }
        
        ListNode mid_nakalo=midhelp(head);
        ListNode revmid=revhelp(mid_nakalo);
        
        while(revmid!=null){
            if(revmid.val!=head.val){
                return false;
            }
            else
            {revmid=revmid.next;
            head=head.next;}
        }
        
        return true;
        
    }
    
    public ListNode midhelp(ListNode head){
        
          ListNode fast=head;
          ListNode slow=head;
        
        while(fast!=null && fast.next !=null){
            
            slow=slow.next;
            fast=fast.next.next;
                   
        }
        if(fast!=null){       
            return slow.next;  
        }
        else
              return slow; 
    }
    
    public ListNode revhelp(ListNode head){
        
         ListNode prev=null;
         ListNode curr=head;
        
        while(curr!=null){
            
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
          
        }
        return prev;
     
    }

}