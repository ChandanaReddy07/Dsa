class Solution {
    public List<String> fizzBuzz(int n) {
        int count=0,count1=0;
        List<String> lx=new ArrayList<String>();  
        
        
        for(int i=1;i<=n;i++){
            count++;
            count1++;
            String s="";
            
               if(count==3 || count1==5){
             if(count==3){
                s+="Fizz";
                count=0;
               }
             if(count1==5){
                s+="Buzz";
                count1=0;
            }
            }
            else{
                s+=i;
            } 
             lx.add(s); 
            }
           
        
        return lx;
    }
}