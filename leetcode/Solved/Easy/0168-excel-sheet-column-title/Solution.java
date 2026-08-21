class Solution {
    public String convertToTitle(int columnNumber) {
        
        String[] alp = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I",
                                     "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                                     "S", "T", "U", "V", "W", "X", "Y", "Z"};
       
        String ans = "";
        
        while (true) {

            ans += alp[columnNumber % 26];
            columnNumber /= 27;

            if (columnNumber < 27) break;
        }

        return ans;

    }
}