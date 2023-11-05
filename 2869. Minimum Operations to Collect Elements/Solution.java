class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int ans=0;
        Set<Integer> set=new HashSet<>();
        for(int i=1; i<=k; i++) {
            set.add(i);
        }
        for(int i=nums.size()-1; i>=0; i--) {
            ans++;
            if(set.contains(nums.get(i))) {
                set.remove(nums.get(i));
                if(set.isEmpty()) {
                    break;
                }
            }
        }
        return ans;
    }
}