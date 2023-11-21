class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
          List<Integer> result = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Get the absolute value of the current number
            int val = Math.abs(nums[i]) - 1;

            // If the number at the index corresponding to val is positive, negate it
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        // Iterate through the modified array to find positive values, which represent missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}