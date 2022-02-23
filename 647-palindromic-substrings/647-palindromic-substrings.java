class Solution {
    public int countSubstrings(String s) {
        
        
        int[][] arr= new int[s.length()][s.length()];
        int count=0;
        
        for(int g=0;g<s.length();g++){
            
            for(int i=0,j=g+i;j<s.length();j++,i++){
                if(i==j)
                {
                    arr[i][j]=1;
                    count++;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        arr[i][j]+=(g>1)?arr[i+1][j-1]:1;
                        count+=arr[i][j];
                        
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        
        return count;
        
        
    }
}