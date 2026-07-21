class Solution {
    public String reformat(String s) {
        
        String number = s.replaceAll("[^0-9]", "");
        String alp = s.replaceAll("[^0-9]", "");

        int numberLength = number.length();
        int alpLength = alp.length();
        int diff = numberLength - alpLength;
        if (diff > 1 || diff < -1) return "";

        char[] numberArr = number.toCharArray();
        char[] alpArr = alp.toCharArray();

        String answer = "";

        for (int i = 0; i < Math.min(numberLength, alpLength); i++) {
            answer += numberArr[i];
            answer += alpArr[i];
        }

        if (diff > 0) {
            answer += numberArr[numberLength -1];
        } else if (diff < 0) {
            answer += alpArr[alpLength -1];
        } 


        return answer;
        
    }
}