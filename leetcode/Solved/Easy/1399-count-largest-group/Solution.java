class Solution {
    public int countLargestGroup(int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {

            int mod = 10;
            int num = 0;
            int origin = i;

            while(origin != 0) {
                

                System.out.println(num + " " + origin + " " + mod + " " + (origin % mod));
                num += (origin % mod);
                origin -= (origin % mod);
                mod *= 10;

            }

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        int ans = 0;

        for (int key : map.keySet()) {

            ans = Math.max(ans, map.get(key));
        }

        return ans;
    }
}