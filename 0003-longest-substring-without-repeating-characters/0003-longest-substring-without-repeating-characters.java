class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right=0; right<s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);

            while(map.get(s.charAt(right)) > 1) {
                char leftvalue = s.charAt(left);

                map.put(leftvalue, map.get(leftvalue)-1);

                if(map.get(leftvalue)==0) {
                    map.remove(leftvalue);
                }

                left++;
            }
            int length = right - left + 1;
            max = Math.max(max, length);
        }
        return max;
    }
}