class Solution {
    public String smallestPalindrome(String s) {

        if (s.length() == 1) return s;

        Map<Character, Integer> map = new TreeMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }       

        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        for (char c : map.keySet()) {

            int length = map.get(c) % 2 == 1 ? map.get(c) / 2 + 1 : map.get(c) / 2;
            int reverseLength = map.get(c) / 2;

            for (int i = 0; i < length; i++) sb.append(c);
            for (int i = 0; i < reverseLength; i++) reverse.append(c); 

        }

        System.out.println(map);
        reverse = reverse.reverse();

        sb.append(reverse);

        return sb.toString();

    }
}