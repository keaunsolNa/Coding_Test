class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int ans = 0;
        char[] arr = jewels.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            
            char target = arr[i];
            ans += stones.chars().filter(c -> c == target).count();
        }

        return ans;   
    }
}