import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
//            CountNodes g = new CountNodes();
            System.out.println(getCount(head));
        }
    }
   
    
    
    
 // } Driver Code Ends


/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/


    public static int getCount(Node head)
    {
        Node p=head;
        int count=0;
        
        while(p!=null){
        p=p.next;
        count++;}
        return count;
    }
    

// { Driver Code Starts.
}

  // } Driver Code Ends