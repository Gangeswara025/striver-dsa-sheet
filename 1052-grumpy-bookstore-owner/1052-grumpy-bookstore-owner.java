class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int non_grumpy_sum = 0;
        int right = 0;
        int left = 0;
        int new_grumpy = 0;
        int grumpy_return = 0;


        for(int i=0; i<grumpy.length; i++) {
            if(grumpy[i] == 0) {
                non_grumpy_sum+=customers[i];
            }
        }

        while(right < grumpy.length) {
            if(grumpy[right]==1) {
                new_grumpy+=customers[right];  
            }

            int length = right - left + 1;
            if(length > minutes) {
                if(grumpy[left] == 1) {
                    new_grumpy -= customers[left];
                }
                left++;
            }
            

            if(new_grumpy > grumpy_return) {
                grumpy_return = new_grumpy;
            }

            right++;
        }

        return non_grumpy_sum+grumpy_return;
    }
}