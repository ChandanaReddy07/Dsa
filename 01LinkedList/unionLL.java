package LinkedList;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class UnionLL { 
    Node head;  

    void getUnion(Node head1, Node head2)
    {
        Node t1 = head1, t2 = head2;
 
        while (t1 != null) {
            push(t1.data);
            t1 = t1.next;                                                                                                                                                                                                 
        }
 
    
        while (t2 != null) {
            if (!isPresent(head, t2.data))
                push(t2.data);
            t2 = t2.next;
        }
    }
 
    
      
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    void push(int new_data)
    {
       
        Node new_node = new Node(new_data);
 
        new_node.next = head;
        head = new_node;
    }
 
  
    boolean isPresent(Node head, int data)
    {
        Node t = head;
        while (t != null) {
            if (t.data == data)
                return true;
            t = t.next;
        }
        return false;
    }
 
    
}
