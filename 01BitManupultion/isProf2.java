public class isProf2 {
    public static boolean isPowerofTwo(long x){
        
        // Your code here
           // Your code here  
        if(x==0){
            return false;
        }
        
        long mask = x&(x-1) ;
        
        return mask==0 ? true : false ; 
        
        
    }
}
