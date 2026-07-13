class Solution {
    public boolean isHappy(int n) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(n, 1);

        while (true) {

            System.out.println("N : " + n);
            System.out.println(map);

            if (n == 1) return true;

            if (map.containsKey(n) && map.get(n) > 1) return false;

            String number = n + "";
            int num = 0;

            for (int i = 0; i < number.length(); i++) {

                int tn = Integer.parseInt(number.charAt(i) + "");
                num += (tn * tn);
            }

            n = num;
    		map.put(n, map.getOrDefault(n, 0) + 1);

        }   
    }
}