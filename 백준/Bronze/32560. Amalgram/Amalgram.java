import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for (char c : a) {
            arr[c - 'a']++;
        }
        for (char c : b) {
            arr2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            int cnt = Math.max(arr[i], arr2[i]);
            if (cnt == 0) continue;
            for (int j = 0; j < cnt; j++)
            {
                bw.write((char)('a' + i));
            }
        }

        bw.flush();
        bw.close();
    }
}