/*
Problem: Contains Duplicate

Approach:
1. Create a HashSet
2. Traverse array one by one
3. If element already exists → duplicate found
4. Otherwise add it to set

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}
