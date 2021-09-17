class Solution {
    public int minInsertions(String s) {
    
        
        int res=0;
        int op=0;
        int i=0;
        
        while(i<s.length()){
            
            char c=s.charAt(i);     
            //when s[i]="("
          //()))
            if(c=='('){
                op++;
                i++;
            }
            else if(op!=0){
                if(i==s.length()-1 || s.charAt(i+1)!=')')
                    res++;        
                else{
                    i++;
                }
                i++;
                op--;
            }
            else{
                op++;
                res++;
            }
        }  
        System.out.println("ha"+res+"ha"+op);
        return res + 2*op;
    }
}
