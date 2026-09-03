class Solution {
    public int climbStairs(int n) {

        int previousTwo = 0;
        int previousOne = 1;

        for (int step = 0; step < n; ++step) {

            int current = previousTwo + previousOne;

            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }
}
