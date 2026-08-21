class Solution {
    public String convertToTitle(int columnNumber) {
        
        String[] alp = new String[] {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I",
                                     "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                                     "S", "T", "U", "V", "W", "X", "Y"};
       
        StringBuilder ans = new StringBuilder();
        
        while (true) {

            ans.insert(0, alp[columnNumber % 26]);

            if (columnNumber <= 26) {
                // ans.insert(0, alp[columnNumber % 26]);
                break;
            }

            columnNumber /= 26;
        }

        return ans.toString();

    }
}