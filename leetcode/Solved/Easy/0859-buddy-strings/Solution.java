class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();

        if (sArr.length != goalArr.length) return false;
        
        int length = sArr.length;
        int bit = 0;

        for (int i = 0; i < length; i++) {
            if (sArr[i] != goalArr[i]) bit++;   
        }

        return bit == 0 || bit == 2;
        
    }
}