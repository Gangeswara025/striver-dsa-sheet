class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        int right = k-1;
        long sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++) {
            sum+=nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        long max = 0;

        if(map.size() == k) {
            max = sum;
        }

        while(right < nums.length-1) {
            int leftvalue = nums[left];
            map.put(leftvalue, map.get(leftvalue)-1);

            if(map.get(leftvalue)==0) {
                map.remove(leftvalue);
            }

            right++;
            int rightvalue = nums[right];

            map.put(rightvalue, map.getOrDefault(rightvalue, 0)+1);

            sum = sum - leftvalue + rightvalue;

            if(map.size() == k) {
                max = Math.max(max, sum);
            }

            left++;
        }
        return max;
    }
}