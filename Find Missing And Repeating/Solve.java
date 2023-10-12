class Solve {
    int[] findTwoElement(int a[], int n) {
        // code here
        int result[]=new int[2];
        int currsum=0;
        int origsum=0;
        
        for(int i=0; i<n; i++) {
          int origele=Math.abs(a[i]);
          int index=origele-1;
          
          if(a[index]<0) {
              result[0]=origele;
          }
          a[index]=-a[index];
          origsum+=(i+1);
          currsum+=origele;
        }
        result[1]=origsum-(currsum-result[0]);
        return result;
    }
}










