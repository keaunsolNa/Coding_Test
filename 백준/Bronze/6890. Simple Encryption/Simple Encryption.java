import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        char[] alp = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] column = br.readLine().toCharArray();
        char[] input = br.readLine().toCharArray();

        for (char c : input)
            if (c - 'A' >= 0 && c - 'A' <= 25) sb.append(c);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {

            int len = column[i % column.length] - 'A';

            int temp = sb.charAt(i) - 'A';
            temp = temp + len >= 26 ? temp + len - 26 : temp + len;
            ans.append(alp[temp]);

        }

        System.out.print(ans);


    }


}