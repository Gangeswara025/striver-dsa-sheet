class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int max_zeros = 0;
        int max = 0;

        
        for(int right=0; right<nums.length; right++) {
            if(nums[right] == 0) {
                max_zeros+=1;
            }

            while(max_zeros > 1) {
                if(nums[left]==0) {
                    max_zeros-=1;
                }
                left++;
            }
            int length = right-left;
            max = Math.max(max, length);
        }
        return max;
    }
}