class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        boolean[][] seats = new boolean[n][10];

        for (int[] reserved : reservedSeats) {
            seats[reserved[0] - 1][reserved[1] - 1] = true;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            boolean left =
                    !seats[i][1] &&
                    !seats[i][2] &&
                    !seats[i][3] &&
                    !seats[i][4];

            boolean right =
                    !seats[i][5] &&
                    !seats[i][6] &&
                    !seats[i][7] &&
                    !seats[i][8];

            if (left && right) {
                ans += 2;
            } else if (left || right) {
                ans += 1;
            } else {
                boolean middle =
                        !seats[i][3] &&
                        !seats[i][4] &&
                        !seats[i][5] &&
                        !seats[i][6];

                if (middle) {
                    ans += 1;
                }
            }
        }

        return ans;
    }
}