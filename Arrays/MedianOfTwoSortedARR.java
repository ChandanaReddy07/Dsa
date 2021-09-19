class GFG 
{ 
    static double medianOfArrays(int n, int m, int ar1[], int ar2[]) 
    {
        // Your Code Here
        
    int i = 0;
 
    int j = 0;
    int count;
    int m1 = -1, m2 = -1;
   
    if ((m + n) % 2 == 1) 
    {
        for(count = 0; count <= (n + m) / 2; count++)
        {
            if (i != n && j != m) 
            {
                m1 = (ar1[i] > ar2[j]) ?  ar2[j++] : ar1[i++];
            } 
            else if (i < n)
            {
                m1 = ar1[i++];
            }
              
            // for case when j<m,
            else 
            {
                m1 = ar2[j++];
            }
        }
        return m1;
    }
 
    else 
    {
        for(count = 0;  count <= (n + m) / 2; count++)
        {
            m2 = m1;
            if (i != n && j != m) 
            {
                m1 = (ar1[i] > ar2[j]) ?  ar2[j++] : ar1[i++];
            } 
            else if (i < n)
            {
                m1 = ar1[i++];
            }
           
            else
            {
                m1 = ar2[j++];
            }
        }
    double x=(double)(m1 + m2) / 2;;
        return x;
    }
    }
}