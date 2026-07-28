class Solution {
    public String smallestPalindrome(String s) {

        Map<Character, Integer> map = new TreeMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }       

        StringBuilder sb = new StringBuilder();

        for (char c : map.keySet()) {

            for (int i = 0; i < map.get(c) / 2; i++) {
                sb.append(c);
            }
        }

        String reverseText = sb.toString();
        StringBuilder reverse = new StringBuilder(reverseText).reverse();

        sb.append(reverse);

        return sb.toString();

    }
}