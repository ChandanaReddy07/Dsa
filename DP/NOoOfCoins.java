// public int minCoins(int coins[], int m, int V) 
// { 
   
//      int table[] = new int[V + 1];

//     table[0] = 0;

//     for (int i = 1; i <= V; i++)
//     table[i] = Integer.MAX_VALUE;

//     for (int i = 1; i <= V; i++)
//     {
//         for (int j = 0; j < m; j++)
//         if (coins[j] <= i)
//         {
//             int sub_res = table[i - coins[j]];
//             if (sub_res != Integer.MAX_VALUE  && sub_res + 1 < table[i])
//                    table[i] = sub_res + 1;
            
//         }
        
//     }
  
//       if(table[V]==Integer.MAX_VALUE)
//         return -1;
  
//     return table[V];
// } 
class Solution{

	public int minCoins(int nums[], int n, int sum) 
	{ 
	    
	    int t[][] = new int[n+1][sum+1];
        for(int i=0;i<sum+1;i++){
            t[0][i]=Integer.MAX_VALUE-1;
        }
        for(int i=1;i<n+1;i++){
            t[i][0]=0; 
        }
  
            for(int j=1;j<sum+1;j++){
                if(j%nums[0]==0){
                    t[1][j] = j/nums[0] ; // variation 
                }else{
                    t[1][j] = Integer.MAX_VALUE-1;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(nums[i-1]<=j){
                    t[i][j] = Math.min(t[i-1][j] , t[i][j-nums[i-1]]+1);   // variation 
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum]==Integer.MAX_VALUE-1? -1 :  t[n][sum];


     }

}