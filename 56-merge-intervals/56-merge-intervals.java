class Solution {
    public int[][] merge(int[][] arr) {
        
        
       //sorting array on the basis of the 0 index
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
          
         int l=arr.length,count=1,j=0;
         int max=arr[0][1],min;
        
        
        //knowing number of elements in our final array based on below logic
        for (int i=1;i<l;i++){
            if(arr[i][0]>max){
                count++;
                 max=arr[i][1];
            }
            else{
                if(arr[i][1]>max)
                    max=arr[i][1];
            }
           
        }
        
        //initialising array with same length calculated above
         int[][] x= new int[count][2];
         max=arr[0][1] ; min=arr[0][0];
        
        //our first interval will be the first elemnt of the given array
        x[j][1]=max;
        x[j][0]=min;
        
      
          for (int i=1;i<l&&j<count;i++){
             //aim is to check each element min value with the current max if it is less //than curent max ....then it will become the part of previos element or interval
            if(arr[i][0]<=max){
              
                if(arr[i][1]>max){
                
                    max=arr[i][1];
                }          
                           
            }
              //otherwise it will form a new interval with updated max n min
               else
              {   
                   j++;
                   max=arr[i][1];
                   min=arr[i][0];  
               } 
              //finaly alloting the values to our arrray in each loop
            x[j][1]=max;
            x[j][0]=min; 
        }    
   return x;         
    }
}