class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        while(i < nums.length) {
            int leftsum = 0;
            int rightsum = 0;
            for(int j=i-1; j>=0; j--) {
                leftsum+=nums[j];
            }
            for(int k=i+1; k<nums.length; k++) {
                rightsum+=nums[k];
            }

            if(leftsum == rightsum) {
                return i;
            }
            i++;
        }
        return -1;
    }
}