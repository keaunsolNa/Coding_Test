import java.io.*;
import java.util.Arrays;

class Solution {
    public String solution(long n, String[] bans) {
        
        String answer = "";

        long[] bansNums = new long[bans.length];

        for(int i = 0; i < bans.length; i++) {
            bansNums[i] = convertStringToLong(bans[i]);
        }

        Arrays.sort(bansNums);
        for(long bn : bansNums) if(bn <= n) n++;

        answer = convertLongToString(n);

        return answer;
    }
    
    private String convertLongToString(long num)
    {

        StringBuilder str = new StringBuilder();

        while (num > 0) {
            str.insert(0, (char)((num - 1) % 26 + 1 + 96));
            num = (num- 1 ) / 26;
        }

        return str.toString();
    }

    private Long convertStringToLong(String str)
    {
        int length = str.length();
        long num = 0;

        for(int j = 0; j < length; j++) {
            num += (long)((str.charAt(j) - 96) * Math.pow(26, (length - 1 - j)));
        }

        return num;
    }
}