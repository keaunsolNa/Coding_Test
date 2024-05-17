import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arrS = new int[26];
        int[] arrL = new int[26];

        while (n --> 0) {

            char[] arr = br.readLine().toCharArray();

            for (int temp : arr) {

                if(temp == 32) continue;
                if (temp <= 90) arrL[temp - 65]++;
                else arrS[temp - 97]++;
            }

        }

        for (int i = 0; i < 26; i++)
            if (arrS[i] != 0) sb.append((char)(i + 'a')).append(" ").append(arrS[i]).append("\n");

        for (int i = 0; i < 26; i++)
            if (arrL[i] != 0) sb.append((char)(i + 'A')).append(" ").append(arrL[i]).append("\n");

        System.out.println(sb);
    }

}
