class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++) {
            int c = candies[i]+extraCandies;
            boolean gcandy = true;
            for(int j=0; j<candies.length; j++) {
                if(c < candies[j]) {
                    gcandy = false;
                    break;
                }
            }
            result.add(gcandy);
        }
        return result;
    }
}