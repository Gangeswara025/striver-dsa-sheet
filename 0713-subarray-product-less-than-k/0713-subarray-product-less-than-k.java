class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        
        long product = 1;
        int count = 0;

        for(int right=0; right<nums.length; right++) {
            product*=nums[right];
            
            if(k <= 1)
                return 0;

            while(product >= k) {
                product /= nums[left];
                left++;
            }

            int valid_length = right - left + 1;
            count+=valid_length;
        }
        return count;
    }
}