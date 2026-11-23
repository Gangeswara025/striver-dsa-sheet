class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int max = 0;

        while (i < nums.length - 1) {
            for (int j = i + 1; j < nums.length; j++) {
                int result = (nums[i] - 1) * (nums[j] - 1);

                if (result > max) {
                    max = result;
                }
            }

            i++;
        }

        return max;
    }
}