import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] name = new String[n];
        for(int i = 0; i < n; i++) name[i] = br.readLine();

        for(int i = 0; i < m; i++) {

            char[] temp = new char[26];
            int max = 0;
            for(int j = 0; j < n; j++) {
                int idx = name[j].charAt(i) - 'a';
                temp[idx]++;
                max = Math.max(max, temp[idx]);
            }

            for(int j = 0; j < 26; j++) if(temp[j] == max) {
                System.out.print((char)(j + 'a'));
                break;
            };

        }



    }


}