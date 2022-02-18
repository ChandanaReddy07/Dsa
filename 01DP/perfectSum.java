 class perfectSum {

	public int perfectSum(int nums[],int n, int sum) 
	{ 
	    // Your code goes here
	     int t[][] = new int[n+1][sum+1];
        for(int i=0;i<sum+1;i++){
            t[0][i]=0; 
        }
        for(int i=0;i<n+1;i++){
            t[i][0]=1; 
        }
          int mod = 1000000007;
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    t[i][j] =(t[i-1][j] + t[i-1][j-nums[i-1]])% mod;
                }else{
                    t[i][j] = t[i-1][j]% mod;
                }
            }
        }
        return t[n][sum];
	
	} 
}

