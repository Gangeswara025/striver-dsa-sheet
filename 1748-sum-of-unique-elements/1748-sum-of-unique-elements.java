class Solution {
    public int sumOfUnique(int[] nums) {
        int[] new_arr = new int[nums.length];
        int k=0;

        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            boolean found = true;
            for(int j=0; j<nums.length; j++) {
                if(i!=j && nums[i]==nums[j]) {
                    found = false;
                    break;
                }
            }
            if(found) {
                new_arr[k] = nums[i];
                k++;
            }
        }
        for(int g=0; g<new_arr.length; g++) {
            sum+=new_arr[g];
        }
        return sum;
    }
}