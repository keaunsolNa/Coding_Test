class Solution {
    public int distributeCandies(int n, int limit) {

        if (n > 3 * limit) return 0;
      
        long totalWays = calc(n + 2);
      
        if (n > limit) totalWays -= 3 * calc(n - limit + 1);
      
        if (n - 2 >= 2 * limit) totalWays += 3 * calc(n - 2 * limit);
      
        return (int) totalWays;
    }

    private long calc(int n) {
        return 1L * n * (n - 1) / 2;
    }
}