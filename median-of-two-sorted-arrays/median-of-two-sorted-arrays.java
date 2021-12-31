class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int i = 0;
 
    int j = 0;
    int count;
    int m1 = -1, m2 = -1;
    int n=ar1.length,m=ar2.length;
        //System.out.print("n="+n+"m="+m);
   
        for(count = 0; count <= (n + m) / 2; count++)
        {
            
            m2=m1;
            if (i != n && j != m) 
            {
                m1 = (ar1[i] > ar2[j]) ?  ar2[j++] : ar1[i++];
            } 
            else if (i < n )
            {
                m1 = ar1[i++];
            }
              
            // for case when j<m,
            else 
            {
                m1 = ar2[j++];
            }
        }
        
        
        return (m + n) % 2 == 1 ? m1 : (double)(m1 + m2) / 2;
    
        
        
        //brutforce
//          int n=nums1.length+nums2.length;
//         int[] x= new int[n];
        
//         int a=0,b=0,i;
//         for( i=0;i<n;i++){
//             if(a!=nums1.length && b!=nums2.length)
//             {if((nums1[a]>nums2[b])){
//                  x[i]=nums2[b];
//                 b++;
//             }
//             else {
//                 x[i]=nums1[a];
//                 a++;
//             }
//             }
//             else{
//                 if(a<nums1.length){
//                      x[i]=nums1[a];
//                       a++;
//                 }
//                 else{
//                      x[i]=nums2[b];
//                       b++;
//                 }
//             }
            
//             //System.out.println(x[i]);
           
//         }
        
//         double r;
//         if(n%2!=0){
//             r=x[(n/2)];
//         }
//         else{
//              r=x[(n/2)-1]+x[n/2];
//             r/=2;
//         }
        
//         return r;
        
        
    }
}
