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
    public ListNode reverseList(ListNode head) {
        
        ListNode past=null;
        ListNode curr=head;
        ListNode next=head;
        
        while(curr!=null){
            next=curr.next;
            curr.next=past;
            past=curr;
            curr=next;
        }
        
        return past;
        
        
    }
}