import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] str = br.readLine().toCharArray();
        int SCount = 0;
        int LCount = 0;

        for (char c : str) {
            if (c == 'S') {
                SCount++;
            } else if (c == 'L') {
                LCount++;
            }
        }

        for (int i = 0; i < SCount; i++) {
            bw.write("SciCom");
        }
        for (int i = 0; i < LCount; i++) {
            bw.write("Love");
        }

        bw.flush();
        bw.close();
    }
}