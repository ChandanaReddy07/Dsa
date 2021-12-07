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
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;

        
    }
//         long x=l1.val;
//         long tns=10;
        
//         ListNode tmp=l1.next;
//         while(tmp!=null){
//           x=tmp.val*tns + x;
//           tns*=10;
//           tmp=tmp.next;
            
//         }
        
//          long y=l2.val;
//          tns=10;
        
//         tmp=l2.next;
//         while(tmp!=null){
//           y=tmp.val*tns + y;
//           tns*=10;
//           tmp=tmp.next;
//         }
//         System.out.println(x);
//         System.out.println(y);
//        long sum=x+y;
//         // System.out.print(sum);
//         return util( sum) ;
        
//     }
    
//      public ListNode util( long num) {
         
//           // System.out.print(num);
//          ListNode x=new ListNode((int)(num%10));
//          num/=10;
     
//          ListNode yo=x;
//          while(num!=0){
//             ListNode y=new ListNode((int)(num%10));
//              // System.out.print((int)num%10);
//              yo.next=y;
//              yo=yo.next;
//             num/=10;
//          }
         
//          return x;
    
//     }
  
}