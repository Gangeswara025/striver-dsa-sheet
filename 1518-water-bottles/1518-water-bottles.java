class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;              
        int empty = numBottles;            
        while (empty >= numExchange) {
            int newFull = empty / numExchange;   
            int leftover = empty % numExchange; 
            sum += newFull;                  
            empty = newFull + leftover;      
        }
        return sum;
    }
}