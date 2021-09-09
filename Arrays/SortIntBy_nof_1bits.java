class Solution {
    
     
      public int[] sortByBits(int []arr) {

      int[][] x=new int[arr.length][2];  
      int count=0;
 
        for(int i=0;i<arr.length;i++){
         
            count=0;
            int n=arr[i];
            while(n>0){
                n&=n-1;
                count++;
            }
            x[i][0]=arr[i];
            x[i][1]=count;
            
        }
           Arrays.sort(x,(b,a)->((a[1]!=b[1]) ?Integer.compare(b[1],                               a[1]):Integer.compare(b[0], a[0])));
          
          for(int i=0;i<arr.length;i++){ 
              arr[i]=x[i][0];
          }
          
        return arr;
    }
}