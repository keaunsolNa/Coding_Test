class Solution {
    public int solution(int storey) {
        int answer = 0;
        int digit = 10;
        while(storey != 0) {

            if(Math.abs(digit - (storey % digit)) < storey % digit || storey % digit == 5) {
                int i = Math.abs(digit - (storey % digit)) / 10;
                answer += Integer.parseInt((Math.abs(digit - (storey % digit)) + "").charAt(0) + "");
                storey += Math.abs(digit - (storey % digit));
            }
            else {
                answer += Integer.parseInt((Math.abs(storey % digit) + "").charAt(0) + "");
                storey -= storey % digit;
            }
            digit *= 10;
        }

        System.out.println(answer);

        return answer;

    }
}