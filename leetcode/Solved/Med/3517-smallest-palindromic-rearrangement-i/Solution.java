class Solution {
    public String smallestPalindrome(String s) {

        int length = s.length();
        int halfLength = length / 2;

        char[] halfChars = s.substring(0, halfLength).toCharArray();
        Arrays.sort(halfChars);

        String sortedHalf = new String(halfChars);
        String reversedHalf = new StringBuilder(sortedHalf).reverse().toString();
        String middle = length % 2 == 1 ? String.valueOf(s.charAt(halfLength)) : "";

        return sortedHalf + middle + reversedHalf;
    }
}
