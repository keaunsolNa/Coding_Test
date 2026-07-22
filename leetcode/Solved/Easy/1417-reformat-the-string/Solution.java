class Solution {
    public String reformat(String s) {

        String digits = s.replaceAll("[^0-9]", "");
        String letters = s.replaceAll("[0-9]", "");

        int digitLength = digits.length();
        int letterLength = letters.length();
        int diff = digitLength - letterLength;

        if (diff > 1 || diff < -1) {
            return "";
        }

        // The longer group always takes the leading position so the result alternates.
        String first = (diff >= 0) ? digits : letters;
        String second = (diff >= 0) ? letters : digits;

        StringBuilder answer = new StringBuilder(s.length());

        for (int i = 0; i < second.length(); i++) {
            answer.append(first.charAt(i));
            answer.append(second.charAt(i));
        }

        if (first.length() > second.length()) {
            answer.append(first.charAt(first.length() - 1));
        }

        return answer.toString();
    }
}
