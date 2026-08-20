import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> reserved = new HashMap<>();

        for (int[] seat : reservedSeats) {
            reserved
                .computeIfAbsent(seat[0], k -> new HashSet<>())
                .add(seat[1]);
        }

        int ans = (n - reserved.size()) * 2;

        for (Set<Integer> seats : reserved.values()) {

            boolean left = true;   // 2~5
            boolean right = true;  // 6~9
            boolean middle = true; // 4~7

            for (int seat : seats) {
                if (seat >= 2 && seat <= 5) {
                    left = false;
                }

                if (seat >= 6 && seat <= 9) {
                    right = false;
                }

                if (seat >= 4 && seat <= 7) {
                    middle = false;
                }
            }

            if (left && right) {
                ans += 2;
            } else if (left || right || middle) {
                ans += 1;
            }
        }

        return ans;
    }
}