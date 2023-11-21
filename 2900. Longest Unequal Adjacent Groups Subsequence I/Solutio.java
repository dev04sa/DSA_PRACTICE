class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> ans= new ArrayList<>();
        int prev=groups[0];
        ans.add(words[0]);
        for(int i=1; i<words.length; i++) {
            if(groups[i]!=prev) {
                ans.add(words[i]);
                prev=groups[i];
            }
        }
        return ans;
    }
}