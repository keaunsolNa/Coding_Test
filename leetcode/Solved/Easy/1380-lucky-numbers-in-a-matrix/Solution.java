class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        List<Integer> list = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {

            int min = 51;
            int idx = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    idx = j;
                }
            }

            boolean check = true;

            for (int j = 0; j < matrix.length; j++) {

                if (min < matrix[j][idx]) {
                    check = false;
                    break;
                }
            }

            if (check) list.add(min);
        }

        return list;
    }
}