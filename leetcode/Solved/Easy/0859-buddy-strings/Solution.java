class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();

        if (sArr.length != goalArr.length) return false;
        
        int length = sArr.length;
        int bit = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            if (sArr[i] != goalArr[i]) bit++;   
            set.add(sArr[i]);
        }

        if (bit == 0 && set.size() == 1) return true;
        if (bit == 0) return false;
        if (bit == length) return true;
        
        return bit != 2;
        
    }
}