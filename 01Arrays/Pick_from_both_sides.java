public class Solution {
    public int solve(int[] A, int B) {

int sum=0;

int k=B,max=Integer.MIN_VALUE;
 for(k=B;k>=0;k--){
     sum=0;

      for(int i=0;i<k;i++){
         sum+=A[i];
     }
     for(int j=A.length-1, counter=0;counter<B-k;counter++){
         sum+=A[j--];
     }

     if(sum>max){
         max=sum;
     }


 }
    return max;
    }}
      
