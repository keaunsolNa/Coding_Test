class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int[] isJewel = new int[128];
      
        for (char jewel : jewels.toCharArray()) {
            isJewel[jewel] = 1;
        }
      
        int jewelCount = 0;
        for (char stone : stones.toCharArray()) {
            jewelCount += isJewel[stone];
        }
      
        return jewelCount;
    }
}