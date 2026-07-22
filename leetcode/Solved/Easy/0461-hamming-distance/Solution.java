class Solution {
    public int hammingDistance(int x, int y) {
        
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        

        while(binaryX.length() != binaryY.length()) {

            if (binaryX.length() < binaryY.length()) binaryX = "0" + binaryX;
            else binaryY = "0" + binaryY;
        }

        char[] xArr = binaryX.toCharArray();
        char[] yArr = binaryY.toCharArray();
        int ans = 0;

        for (int i = 0; i < xArr.length; i++) {

            if (xArr[i] != yArr[i]) ans++;
        }

        return ans;
        
    }
}