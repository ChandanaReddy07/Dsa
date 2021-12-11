class Solution
{

	public int minDifference(int arr[], int N) 
	{ 
	    // Your code goes here
	    int sum=0;
	     for(int i=0;i<N;i++){
                sum+=arr[i];
            }
	     Boolean[][] t=new Boolean[N+1][sum+1];
            
               Boolean[] d=new Boolean[sum+1];
            
            for(int i=0;i<sum+1;i++){
                t[0][i]=false;
            }
             for(int i=0;i<N+1;i++){
                t[i][0]=true;
            }
            d[0]=false;
             for(int i=1;i<N+1;i++){
                 for(int j=1;j<sum+1;j++){
                     
                     if(arr[i-1]<=j)
                     t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                     else
                     t[i][j]=t[i-1][j];
                     
                     if(i==N){
                         d[j]= t[i][j];
                     }
            }
            }
            int min=sum;
              for(int i=1;i<(sum/2) + 1;i++){
                if(d[i]){
                    if(min>(sum-2*i)){
                        min=Math.abs(sum-2*i);
                    }
                }
            }
            
            return min;
            
           
	} 
	
}
