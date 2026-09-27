class Solution {
    public int totalFruit(int[] fruits) {
        int type = 0;
        int max = 0;
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right=0; right<fruits.length; right++) {
            if(!map.containsKey(fruits[right])) {
                type+=1;
            }
            map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);

            while(type > 2) {

                int left_value = fruits[left];

                map.put(left_value, map.get(left_value) - 1);

                if(map.get(left_value)==0) {
                    map.remove(left_value);
                    type-=1;
                }

                left++;
            }
            int length = right - left + 1;
            max = Math.max(max, length);
        }
        return max;
    }
}