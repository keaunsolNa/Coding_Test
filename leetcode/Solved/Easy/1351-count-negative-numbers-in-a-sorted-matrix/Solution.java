class Solution {
    public int countNegatives(int[][] grid) {
        
        int cnt = 0;
        for (int[] arr : grid) {

            Arrays.sort(arr);

            for (int i : arr) {

                if (i >= 0) break;
                cnt++;
            }
        }

        return cnt;
        
    }
}