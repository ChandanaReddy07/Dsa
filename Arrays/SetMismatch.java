class Solution{
        public void swap(int[] arr,int i,int c){
        
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
        
    }
  public int[] findErrorNums(int[] arr) {
        
        int i=0;
       int[] a= new int[2];
        
        while(i<arr.length){
            
            int c=arr[i]-1;
          
            if(arr[i]!=arr[c]){
                
                swap(arr,i,c);
                
            }
            else{
                if(i!=c){
                      a[0]=c+1;
                      a[1]=i+1;
                }
                i++;
            }  
        }
  
        return a;
  }
}