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
        
        
        ListNode p= head;
        
        
        int count=0;
            while(p!=null){
            
           count++;
            
            p=p.next;
       
        }       
        
        int m=1;
        
        if(n==count){
            head=head.next;
            return head;
        }
        n=count-n+1;
        
        
        

        p=head;
        
        while(p!=null){
            
            if(n==m+1){
              
                ListNode temp=p.next.next;
                
                p.next=temp;
                
                break;
                
            }
            
            p=p.next;
            
            m++;
        }
        
        return head;
    }
}