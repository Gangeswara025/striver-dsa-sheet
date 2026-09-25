class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = k-1;
        int sum = 0;
        int count = 0;

        for(int i=0; i<k; i++) {
            sum+=arr[i];
        }
        int avg = sum/k;

        if(avg >= threshold) {
            count+=1;
        }

        while(right < arr.length -1) {
            sum = sum - arr[left] + arr[right+1];
            avg = sum/k;
            if(avg >= threshold) {
                count++;
            }
            
            left++;
            right++;
        }
        return count;
    }
}