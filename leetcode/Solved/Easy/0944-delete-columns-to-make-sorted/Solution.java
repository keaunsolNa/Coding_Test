class Solution {
    public int minDeletionSize(String[] strs) {

        int columnCount = strs[0].length();
        int rowCount = strs.length;
      
        int deletionCount = 0;
      
        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {

            for (int rowIndex = 1; rowIndex < rowCount; rowIndex++) {

                if (strs[rowIndex].charAt(columnIndex) < strs[rowIndex - 1].charAt(columnIndex)) {
                    deletionCount++;
                    break;
                }
            }
        }
      
        return deletionCount;
    }
}