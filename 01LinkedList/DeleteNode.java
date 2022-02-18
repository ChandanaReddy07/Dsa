class Solution
{
   void deleteNode(Node Node_ptr)
  {
        Node temp = Node_ptr.next;
        Node_ptr.data = temp.data;
        Node_ptr.next = temp.next;
        temp = null;

}

}