class Solution {
    public String convertToTitle(int columnNumber) {
        
        String[] alp = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I",
                                     "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                                     "S", "T", "U", "V", "W", "X", "Y", "Z"};
       
        StringBuilder ans = new StringBuilder();
        
        while (columnNumber != 0) {

            columnNumber--;
            
            ans.insert(0, alp[columnNumber % 26]);

            columnNumber /= 26;
        }

        return ans.toString();

    }
}