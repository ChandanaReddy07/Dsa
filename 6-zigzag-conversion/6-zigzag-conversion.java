class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1) return s;
        
        StringBuilder res= new StringBuilder();
        int n=s.length();
        int cyc= 2*numRows - 2;
        
        for(int i=0;i< numRows;i++){
            for(int j=0 ; j+i < n ; j += cyc){
                res.append(s.charAt(j+i));
                    
                    if(i!= 0 && i!= numRows - 1 && j + cyc - i < n)
                        res.append(s.charAt(j + cyc - i));
                
                }
        }
        
        return res.toString();
        
    }
}