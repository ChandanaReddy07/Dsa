class Solution{
    static int minJumps(int[] arr){
        // your code here
        
        int curr=0;
        int fav=0;
        int jump=0;
        if(arr[curr]==0)
        {
            return -1;
        }
        for(int i=1;i<arr.length;i++){
            
          if(arr[curr]+curr>=arr.length-1){
              return jump+1;
          }
          if(arr[curr]==0)
                return -1;
            
            if(i < curr+arr[curr]){
                
                if(i+arr[i]>fav+arr[fav])
                {
                    fav = i;
                }
            }
            else if(i == curr+arr[curr])
                {
                    
                if(i+arr[i]>fav+arr[fav])
                     fav = i;
                jump++;
                curr=fav;
            }
            }
            return -1;
        
            }
        }
