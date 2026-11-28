class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int max = 0;

        while(left < right) {
            int length = Math.min(height[left], height[right]);
            int area = length * (right - left);

            if(height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }

            if(area > max) {
                max = area;
            }
        }
        return max;
    }
}