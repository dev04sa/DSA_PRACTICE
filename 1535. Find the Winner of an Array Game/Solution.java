class Solution {
    public int getWinner(int[] arr, int k) {
        int win=0;
        int ele=arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>ele) {
                ele=arr[i];
                win=0;
            }
            if(++win==k) {
                break;
            }
        }
        return ele;
    }
}