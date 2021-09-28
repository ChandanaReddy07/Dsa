class Solution
{
     static long x=0;
static void merge(long arr[], long l, long m, long r)
    {
        // Find sizes of two subarrays to be merged
      try{
          
       long n1 = m - l + 1;
        long n2 = r - m;
 
        /* Create temp arrays */
        long L[] = new long[(int)n1];
        long R[] = new long[(int)n2];
 
        /*Copy data to temp arrays*/
        for (long i = 0; i < n1; i++)
            L[(int)i] = arr[(int)(l + i)];
        for (long j = 0; j < n2; j++)
            R[(int)j] = arr[(int)(m + 1 + j)];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        long i = 0, j = 0;
 
        // Initial index of merged subarry array
        long k = l;
        while (i < n1 && j < n2) {
            if (L[(int)i] <= R[(int)j]) {
                arr[(int)k] = L[(int)i];
                i++;
            }
            else {
                arr[(int)k] = R[(int)j];
                
                  x+=n1-i;
                  j++;
               
            }
            k++;
        }
      while (i < n1) {
            arr[(int)k] = L[(int)i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[(int)k] = R[(int)j];
            j++;
            k++;
        }
      }
    catch(Exception e) {
        System.out.println("error");
    }
 //shsbdhibdjdjc
      
    }
 
static void mergeSort(long arr[],long l,long r){
    if(l<r){
       
    
    long m =(l+ r)/2;
    mergeSort(arr,l,m);
    mergeSort(arr,m+1,r);
    merge(arr,l,m,r);}
}
 
    static long inversionCount(long arr[], long N)
    {
         mergeSort(arr,0,N-1);
        long r=x;
        x=0;
        return r;
       
    }
}