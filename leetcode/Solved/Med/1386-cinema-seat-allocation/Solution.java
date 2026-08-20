class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
        boolean[][] seats = new boolean[n][10];

        for (int i = 0; i < reservedSeats.length; i++) {

            seats[reservedSeats[i][0] - 1][reservedSeats[i][1] - 1] = true;
        }

        int ans = 0;

        for (boolean[] i : seats) {

            System.out.print("1234567890");
            System.out.println();
            for (boolean j : i) System.out.print(j ? "■" : "□");

            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 6; j++) {

                if (!seats[i][j] && !seats[i][j + 1] && !seats[i][j + 2] && !seats[i][j + 3]) {
                    ans++;
                    seats[i][j] = true;
                    seats[i][j + 1] = true;
                    seats[i][j + 2] = true;
                    seats[i][j + 3] = true;
                    break;
                }
            }
        }

        System.out.println("AFTER");
        
        for (boolean[] i : seats) {

            System.out.print("1234567890");
            System.out.println();
            for (boolean j : i) System.out.print(j ? "■" : "□");

            System.out.println();
        }

        return ans;
    }
}