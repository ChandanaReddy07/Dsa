class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
         int i=0,j=0;
        
        int count=0;
        
        while(i<arr1.length && j<arr2.length){
            
            
            if(arr1[i]<arr2[j]){
              
              
              count++;
              
              if(count==k){
                  return arr1[i];
              }
              i++;
            }
            else{
               
                count++;
                if(count==k){
                  return arr2[j];
              }
               j++;
            }
        
        }
        
        if(i!=n){
            return arr1[i+ k - count-1];
        }
        if(j!=m){
             return arr2[j+ k- count-1];
        }
        return 0;
     
        
    }
}