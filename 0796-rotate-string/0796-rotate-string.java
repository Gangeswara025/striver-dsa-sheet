class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
        char temp = arr[0];

            for(int j=1; j<arr.length; j++) {
                arr[j-1] = arr[j];
            }
            arr[arr.length-1] = temp;

            String x = new String(arr);
            if(x.equals(goal)) {
                return true;
            }

        }
    return false;
    }
}