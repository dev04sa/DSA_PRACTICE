class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans =new ArrayList<>();
        List<String> val=new ArrayList<>();
        int ct=0;
        
        for(String word : words) {
            if(word.equals("prev")) {
                ct++;
                if(ct>val.size()) {
                    ans.add(-1);
                } else {
                    ans.add(Integer.valueOf(val.get(ct-1)));
                }
                
            } else {
                val.add(0,word);
                ct=0;
                
            }
        }
        return ans;
    }
}