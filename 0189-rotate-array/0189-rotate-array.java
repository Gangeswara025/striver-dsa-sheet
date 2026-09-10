class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=nums.length-k; i<nums.length; i++) {
            temp.add(nums[i]);
        }
        for(int i=nums.length-1; i>=k; i--) {
            nums[i] = nums[i - k]; 
        }
        int j = 0;
        for(int i=0; i<k; i++) {
            nums[i] = temp.get(j);
            j++;
        }
    }
}