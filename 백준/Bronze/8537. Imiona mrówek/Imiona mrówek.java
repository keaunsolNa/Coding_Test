import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int max = 0;

        while (t --> 0) {

            char[] input = br.readLine().toCharArray();
            boolean[] alp = new boolean[26];

            int total = 0;
            for (char c : input) {

                if(!alp[c - 'a']) total++;
                alp[c - 'a'] = true;
            }

            max = Math.max(max, total);
        }

        System.out.println(max);

    }


}