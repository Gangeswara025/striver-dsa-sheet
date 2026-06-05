/*
Problem: Build Array from Permutation

Approach:
1. Create a new array ans of same size
2. Traverse nums
3. Store nums[nums[i]] in ans[i]
4. Return ans

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
