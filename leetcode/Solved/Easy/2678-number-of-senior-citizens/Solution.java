class Solution {
    public int countSeniors(String[] details) {
        
        int cnt = 0;

        for (String str : details) {

            int age = Integer.parseInt(str.substring(str.length() - 4, str.length() - 2));

            if (age > 60) cnt++;
        }

        return cnt;
    }
}