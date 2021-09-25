
class traversal{
    void printInorder(Node node)
    {
        if (node == null)
            return;
    
        /* first recur on left child */
        printInorder(node.left);
    
        /* then print the data of node */
        System.out.print(node.key + " ");
    
        /* now recur on right child */
        printInorder(node.right);
    }
    
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
        if (node == null)
            return;
    
        /* first print data of node */
        System.out.print(node.key + " ");
    
        /* then recur on left sutree */
        printPreorder(node.left);
    
        /* now recur on right subtree */
        printPreorder(node.right);
    }
    
    
}
