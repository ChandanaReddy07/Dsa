class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	 if (head == null)
    return true;
 
    Node node = head.next;
 
  
    while (node != null && node != head)
    node = node.next;
 
   
    return (node == head);
    }
}