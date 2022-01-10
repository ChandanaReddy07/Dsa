public class Solution {
    public int solve(int[] arr, int B) {

        int i=0,j=arr.length-1,mid=0;

        while(i<=j){
             mid=(i+j)/2;

             

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                break;
            }


            if(arr[mid]>arr[mid+1]){
                  j=mid-1;
              
                
            }
            else if(arr[mid]<arr[mid+1]){
              
                i=mid+1;
            }
            }
                 //System.out.print("mid>>"+mid);

            int a,b,res=-1;
            if(arr[0]<=B && arr[mid-1]>=B){
                a=0;
                b=mid-1;
                // System.out.print("a>>"+a+"b>>"+b);
                res=Bsearch(arr,a,b,B);
                
            }
            else{
                a=mid;
                b=arr.length-1;
                //  System.out.print("a>>"+a+"b>>"+b);
                res=BsearchR(arr,a,b,B);
            }
    return res;
  
        
    }

    public int Bsearch(int[] arr ,int l,int r,int x){
    //  System.out.print("hi");
         while (l <= r) {
        int m = l + (r - l) / 2;

      
        if (arr[m] == x)
            return m;

      
        if (arr[m] < x)
            l = m + 1;

     
        else
            r = m - 1;
    }
    return -1;
    }
     public int BsearchR(int[] arr ,int l,int r,int x){
        
         while (l <= r) {
        int m = l + (r - l) / 2;

      
        if (arr[m] == x)
            return m;

      
        if (arr[m] > x)
            l = m + 1;

     
        else
            r = m - 1;
    }
    return -1;
    }
}
