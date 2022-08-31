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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        
        ListNode head= new ListNode(0);
        
        ListNode res= head;
        
        
        while(list1!=null || list2!=null){
            
            if(list1==null){
               res.next=list2;  
                 break;
            }
            else if(list2==null){
                res.next=list1;
                 break;
            }
          
            
            if(list1.val>list2.val){
                res.next=list2;
                list2=list2.next;
                
            }
            else{
                res.next=list1;
                list1= list1.next;
                
                  
            }
            
            res=res.next;
   
        }
        
        return head.next;
    }
}