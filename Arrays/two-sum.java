/*
Problem: Two Sum

Approach:
1. Use HashMap
2. Store number and index
3. Check target - current element

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int current = nums[i];
            int req = target - current;
            if(map.containsKey(req)) {
                return new int[] {map.get(req), i};
            }

            map.put(current,i);
        }

        return new int[] {-1, -1};
    }
}
