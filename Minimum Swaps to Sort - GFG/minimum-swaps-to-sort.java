// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[])
    {
        // Code here
        HashMap<Integer ,Integer> hm= new HashMap<Integer, Integer>();
        
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        int count=0;
        Arrays.sort(arr);
       
        int j=0,i=0;
        while(i<arr.length){
             if(i != hm.get(arr[i]))
            {   
              
                int temp=arr[i];
                //  System.out.println(temp);
                arr[i]=arr[hm.get(arr[i])];
                //  System.out.println(hm.get(temp));
                arr[hm.get(temp)]=temp;
              
                count++;
            }
            else{
                i++;
            }
           
        }
        return count;
        
    }
}