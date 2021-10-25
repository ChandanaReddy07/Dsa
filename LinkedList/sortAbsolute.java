Node sortList(Node head) {
    // Your code here
    Node prev= head;
    Node curr=prev.next;
    
    //given: 1, -2, -3, 4, -5
    //aim: -5, -3, -2, 1, 4
    
    while(curr!=null){
        
        if(prev.data>curr.data){
            prev.next=curr.next;
            curr.next=head;
            head=curr;
        }
        else{
            prev=curr;
        }
        curr=prev.next;
    }
    return head;
    
}