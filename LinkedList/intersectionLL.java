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
class intersectionLL{ 
    Node head;  // head of list
 
    void getIntersection(Node head1, Node head2)
    {
        Node result = null;
        Node t1 = head1;
 
        
         while (t1 != null) {
            if (isPresent(head2, t1.data))
                push(t1.data);
            t1 = t1.next;
        }
    }
 
    /* Utility function to print list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    /*  Inserts a node at start of linked list */
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
