class Solution {
    public int maxProduct(int[] nums) {
        int finalmax = 0;
        for(int i=0; i<nums.length; i++) {
            int max = 0;
            for(int j=i+1; j<nums.length; j++) {
                int result = (nums[i]-1) * (nums[j]-1);
                if(result > max) {
                    max = result;
                }
            }
            if(max > finalmax) {
                finalmax = max;
            }
        }
        return finalmax;
    }
}