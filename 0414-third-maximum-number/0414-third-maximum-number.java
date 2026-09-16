class Solution {
    public int thirdMax(int[] nums) {

        long largest = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if(num == largest || num == second || num == third) {
                continue;
            }

            if(num > largest) {
                third = second;
                second = largest;
                largest = num;
            }
            else if(num > second) {
                third = second;
                second = num;
            }
            else if(num > third) {
                third = num;
            }
        }

        if(third == Long.MIN_VALUE) {
            return (int) largest;
        }

        return (int) third;
    }
}