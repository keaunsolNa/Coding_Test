class Solution {
    public String smallestPalindrome(String s) {

        int length = s.length();

        String half = s.substring(0, s.length() / 2);
        char[] chars = half.toCharArray();
        Arrays.sort(chars);

        String sortedHalf = new String(chars);
        String reverseHalf = new StringBuilder(sortedHalf).reverse().toString();

        return (sortedHalf + (length % 2 == 1 ? String.valueOf(s.charAt(length / 2)) : "") + reverseHalf);
 
    }
}