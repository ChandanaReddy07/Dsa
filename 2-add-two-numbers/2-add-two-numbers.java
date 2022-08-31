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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       
        
        ListNode dummyHead = new ListNode(0);
        ListNode curr  = dummyHead ;
        int carry=0;
        
//          while (p != null || q != null) {
//         int x = (p != null) ? p.val : 0;
//         int y = (q != null) ? q.val : 0;
//         int sum = carry + x + y;
//         carry = sum / 10;
//         curr.next = new ListNode(sum % 10);
//         curr = curr.next;
//         if (p != null) p = p.next;
//         if (q != null) q = q.next;
//     }
        
        
        while(l1!=null || l2!=null ){
            
            int x=(l1 != null)? l1.val:0;
            int y=(l2 != null)? l2.val:0;
            
            int sum= carry + x + y;
            
            carry=sum / 10;
            
            curr.next=new ListNode(sum % 10);
            
            curr=curr.next;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
            
            
        }
        
         if (carry > 0) {
        curr.next = new ListNode(carry);
    }
        return dummyHead.next;
        
    }
}