class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        boolean check = false;
        for (int key : map.keySet()) {
            
            if (map.get(key) == 1) continue;
            if (isPrime(map.get(key))) return true;
        }

        return false;
    }

    public boolean isPrime(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}