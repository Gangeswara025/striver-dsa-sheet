class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k-1;
        int count = 0;
        String vowels = "aeiou";
        for(int i=0; i<k; i++) {
            if(vowels.contains(String.valueOf(s.charAt(i)))) {
                count+=1;
            }
        }
        int max = count;

        while(right < s.length()-1) {
            if(vowels.contains(String.valueOf(s.charAt(left)))) {
                count-=1;
            }

            right++;

            if(vowels.contains(String.valueOf(s.charAt(right)))) {
                count+=1;
            }

            left++;         


            if(count > max) {
                max = count;
            }
        }

        return max;
    }
}