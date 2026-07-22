class Solution {
    public int countBinarySubstrings(String s) {

        int length = s.length();
        int previousRun = 0;
        int currentRun = 1;
        int result = 0;

        for (int i = 1; i < length; i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currentRun++;
            } else {
                result += Math.min(previousRun, currentRun);
                previousRun = currentRun;
                currentRun = 1;
            }
        }

        return result + Math.min(previousRun, currentRun);
    }
}
