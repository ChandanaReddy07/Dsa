class Solution {

    // structure for storing coordinates of the cell
    static class Ele
    {
        int x = 0;
        int y = 0;
        Ele(int x,int y)
        {
            this.x = x;
            this.y = y;
        }
    }
     
    // function to check whether a cell is valid / invalid
    static boolean isValid(int r,int c,int i, int j)
    {
        return (i >= 0 && j >= 0 && i < r && j < c);
    }
     
 
    // Function to check whether the cell is delimiter
    // which is (-1, -1)
    static boolean isDelim(Ele temp)
    {
        return (temp.x == -1 && temp.y == -1);
    }
     
    // Function to check whether there is still a fresh
    // orange remaining
    static boolean checkAll(int arr[][])
    {
         for (int i=0; i<arr.length; i++)
               for (int j=0; j<arr[0].length; j++)
                  if (arr[i][j] == 1)
                     return true;
         return false;
    }
     
    // This function finds if it is possible to rot all oranges or not.
    // If possible, then it returns minimum time required to rot all,
    // otherwise returns -1
    static int orangesRotting(int arr[][])
    {
        // Create a queue of cells
        Queue<Ele> Q=new LinkedList<>();
        Ele temp;
        int ans = 0;
        
        int r=arr.length;
        int c = arr[0].length;
         // Store all the cells having rotten orange in first time frame
        for (int i=0; i < r; i++)
           for (int j=0; j < c; j++)
               if (arr[i][j] == 2)
                   Q.add(new Ele(i,j));
                 
        // Separate these rotten oranges from the oranges which will rotten
        // due the oranges in first time frame using delimiter which is (-1, -1)
        Q.add(new Ele(-1,-1));
         
        // Process the grid while there are rotten oranges in the Queue
        while(!Q.isEmpty())
        {
            // This flag is used to determine whether even a single fresh
            // orange gets rotten due to rotten oranges in the current time
            // frame so we can increase the count of the required time.
            boolean flag = false;
             
            // Process all the rotten oranges in current time frame.
            while(!isDelim(Q.peek()))
            {
                temp = Q.peek();
                 
                // Check right adjacent cell that if it can be rotten
                if(isValid(r,c,temp.x+1, temp.y) && arr[temp.x+1][temp.y] == 1)
                {
                    if(!flag)
                    {
                        // if this is the first orange to get rotten, increase
                        // count and set the flag.
                        ans++;
                        flag = true;
                    }
                    // Make the orange rotten
                    arr[temp.x+1][temp.y] = 2;
                     
                    // push the adjacent orange to Queue
                    temp.x++;
                    Q.add(new Ele(temp.x,temp.y));
                     
                    // Move back to current cell
                    temp.x--;
                }
                 
                // Check left adjacent cell that if it can be rotten
                if (isValid(r,c,temp.x-1, temp.y) && arr[temp.x-1][temp.y] == 1)
                 {
                        if (!flag)
                        {
                            ans++;
                            flag = true;
                        }
                        arr[temp.x-1][temp.y] = 2;
                        temp.x--;
                        Q.add(new Ele(temp.x,temp.y)); // push this cell to Queue
                        temp.x++;
                 }
                 
                // Check top adjacent cell that if it can be rotten
                 if (isValid(r,c,temp.x, temp.y+1) && arr[temp.x][temp.y+1] == 1) {
                        if(!flag)
                        {
                            ans++;
                            flag = true;
                        }
                        arr[temp.x][temp.y+1] = 2;
                        temp.y++;
                        Q.add(new Ele(temp.x,temp.y)); // Push this cell to Queue
                        temp.y--;
                    }
                  
                 // Check bottom adjacent cell if it can be rotten
                 if (isValid(r,c,temp.x, temp.y-1) && arr[temp.x][temp.y-1] == 1)
                 {
                        if (!flag)
                        {
                            ans++;
                            flag = true;
                        }
                        arr[temp.x][temp.y-1] = 2;
                        temp.y--;
                        Q.add(new Ele(temp.x,temp.y)); // push this cell to Queue
                 }
                 Q.remove();
                  
            }
            // Pop the delimiter
            Q.remove();
             
            // If oranges were rotten in current frame than separate the
            // rotten oranges using delimiter for the next frame for processing.
            if (!Q.isEmpty())
            {
                Q.add(new Ele(-1,-1));
            }
             
            // If Queue was empty than no rotten oranges left to process so exit
        }
         
        // Return -1 if all arranges could not rot, otherwise ans
        return (checkAll(arr))? -1: ans;
         
    }
}

