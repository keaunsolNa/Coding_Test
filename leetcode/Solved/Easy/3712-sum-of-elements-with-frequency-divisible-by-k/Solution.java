class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = 0;

        System.out.println(map);

        for (int key : map.keySet()) {

            if (map.get(key) % k == 0) {
                ans += (key * map.get(key));

                System.out.println(key + " " + map.get(key));
            }
             
        }

        return ans;
    }
}