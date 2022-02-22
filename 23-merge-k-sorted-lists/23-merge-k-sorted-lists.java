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
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> heap=new PriorityQueue<>((a,b)-> a.val-b.val);// min heap
        ListNode head=null;
        ListNode cur=null;
        for(ListNode list:lists){
            if(list!=null){
                heap.add(list);
            }
        }
        while(!heap.isEmpty()){
            ListNode list=heap.poll();
            if(list.next!=null){
               heap.add(list.next);  
            }
           
            if(head==null){
                head=list;
                cur=head;
            }else{
                cur.next=list;
                cur=list;
            }
            
        }
        return head; 
}
}