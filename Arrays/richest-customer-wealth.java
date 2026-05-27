/*
Problem: Richest Customer Wealth

Approach:
1. Visit each customer
2. Calculate total wealth of customer
3. Compare with maximum wealth
4. Return max wealth
Time Complexity: O(m*n)
Space Complexity: O(1)
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}