class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] clone = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count+=1;
                }
            }
            clone[i] = count;
        }
        return clone;
    }
}