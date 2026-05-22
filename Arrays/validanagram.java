/*
Problem: Valid Anagram

Approach:
1. If lengths differ → false
2. Count frequency of each character
3. Increase count for first string
4. Decrease count for second string
5. If all counts become 0 → valid anagram

Time Complexity: O(n)
Space Complexity: O(1)
*/

class AnagramSolution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){

            count[s.charAt(i) - 'a']++;

            count[t.charAt(i) - 'a']--;
        }

        for(int num : count){

            if(num != 0){
                return false;
            }
        }

        return true;
    }
}