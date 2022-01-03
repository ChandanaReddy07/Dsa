class Solution {
    public int jump(int[] arr) {
        int n=arr.length;
        int i=0;
        int count=0;
        
        if(n==1 ){
                  return 0;
                 }
        
         while(i<n){
            
            int max=i+arr[i];
            int jump=i;
            // System.out.print("max="+i);
             
              if(max>=n-1 ){
                  
                 // System.out.print(count);
                  return ++count;
                 }
            for(int j=i+1;j<=i+arr[i];j++){
              
                                     // System.out.print("ha");

                if(max<arr[j]+j){
                    max=arr[j]+j;
                    jump=j;
                    // System.out.print("ha"+jump+"max="+max);
                }
                   if(jump==n-1){                            
                    System.out.print("ha7");
                     return ++count;
                 }
           
            }
            if(jump>i){
                count++;
                i=jump;
            }     
        }
        return 2;
    }
}