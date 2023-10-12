import java.util.*;
class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(fi(arr,n,x));
         ar.add(li(arr,n,x));
         
         return ar;
        
    }
    int fi(int arr[], int n, int x) {
        int st=0;
        int end=n-1;
        int f=-1;
        while(st<=end) {
           int mid=st+(end-st)/2;
           if(arr[mid]==x) {
               f=mid;
               end=mid-1;
           } else if(arr[mid]>x) {
               end=mid-1;
           } else {
               st=mid+1;
           }
        }
        return f;
    }
    int li(int arr[], int n, int x) {
        int st=0;
        int end=n-1;
        int l=-1;
        while(st<=end) {
           int mid=st+(end-st)/2;
           if(arr[mid]==x) {
               l=mid;
              st=mid+1;
           } else if(arr[mid]>x) {
               end=mid-1;
           } else {
               st=mid+1;
           }
        }
        return l;
    }
}