class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);

            int maxfreq = 0;
            for(int freq : map.values()) {
                if(freq > maxfreq) {
                    maxfreq = freq;
                }
            }

            if(right-left+1 - maxfreq > k) {
                char leftvalue = s.charAt(left);

                map.put(leftvalue, map.get(leftvalue)-1);

                if(map.get(leftvalue)==0) {
                    map.remove(leftvalue);
                }

                left++;
            }

            if(right-left+1 - maxfreq <= k) {
                int length = right-left+1;
                max = Math.max(max, length);
            }
        }
        return max;
    }
}