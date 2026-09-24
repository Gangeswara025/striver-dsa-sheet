class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zero_count = 0;
        int max_ones = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zero_count += 1;
            }
            while(zero_count > k) {
                if(nums[left] == 0) {
                    zero_count--;
                }
                left++;
            }
            int length = right - left + 1;
            max_ones = Math.max(max_ones, length);
        }
        return max_ones;
    }
}