class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();

        if (sArr.length != goalArr.length) return false;
        
        int length = sArr.length;
        int bit = 0;
        int[] sArrFreq = new int[26];
        int[] goalArrFreq = new int[26];

        for (int i = 0; i < length; i++) {
            if (sArr[i] != goalArr[i]) bit++;   
            ++sArrFreq[sArr[i] - 'a'];
            ++goalArrFreq[goalArr[i] - 'a'];
        }

        boolean check = false;
        for (int i = 0; i < 26; i++) {

            if (sArrFreq[i] != goalArrFreq[i]) return false;

            if (sArrFreq[i] > 1) check = true;
        }
        
        return bit == 2 || (bit == 0 && check == true);
        
    }
}