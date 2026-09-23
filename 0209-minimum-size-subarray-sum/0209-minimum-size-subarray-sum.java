class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minimum = Integer.MAX_VALUE;
        while(right < nums.length) {
            sum+=nums[right];
            right++;

            while(sum >= target) {
                int length = right - left;
                minimum = Math.min(minimum, length);
                sum -= nums[left];
                left++;
            }
        }
        return minimum == Integer.MAX_VALUE ? 0 : minimum;
    }
}