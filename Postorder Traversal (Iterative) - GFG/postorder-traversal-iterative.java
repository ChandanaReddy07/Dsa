// { Driver Code Starts
// Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> res = g.postOrder(root);
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.print("\n");
            t--;
        }
    }
}

// Position this line where user code will be pasted.
// } Driver Code Ends


// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        
         ArrayList<Integer> list = new ArrayList<Integer>(); 
       Stack<Node> S = new Stack<Node>(); 
        
        // Check for empty tree 
        if (node == null) 
            return list; 
        S.push(node); 
        Node prev = null; 
        while (!S.isEmpty()) 
        { 
            Node current = S.peek(); 

            if (prev == null || prev.left == current || 
                                        prev.right == current) 
            { 
                if (current.left != null) 
                    S.push(current.left); 
                else if (current.right != null) 
                    S.push(current.right); 
                else
                { 
                    S.pop(); 
                    list.add(current.data); 
                } 

            } 
            else if (current.left == prev) 
            { 
                if (current.right != null) 
                    S.push(current.right); 
                else
                { 
                    S.pop(); 
                    list.add(current.data); 
                } 
               
            } 
            else if (current.right == prev) 
            { 
                S.pop(); 
                list.add(current.data); 
            } 

            prev = current; 
        } 

        return list; 
    } 

}