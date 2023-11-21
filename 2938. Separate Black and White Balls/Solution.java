class Solution {
    public long minimumSteps(String s) {
       long res=0;
      long count1=0;
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='1') {
               count1++;
            } else {
                res+=count1;
            }
        }
        return res;
    }
}