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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode fast=head;
         ListNode slow=null;
         ListNode x;
        
        int i=0;  
        
        if(head==null){
            return null;
        }
        if(head.next==null){
             return null;
        }
      
        while(fast.next!=null){
            
             if(i==n-1){
                 slow=head;
                 fast=fast.next;
            }
            else if(i<n){
                if(n==1)
                    slow=fast;
                fast=fast.next;
            }
            
            else{
                fast=fast.next;
                slow=slow.next;
            }   
            i++;  
        }
        
    if(i>=n-1){
   
        ListNode next;
        
        if(slow==null){
          System.out.println(2);
            next=head.next;
            slow=next;
           
            return slow;
            
        }
        else
        {next = slow.next.next;
        slow.next = next;
       // System.out.println(2);
        }
         
    }
     
       
      return head;  
    }
}