import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] str = br.readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < 26; i++) {

            boolean flag = true;
            for (char c : str) {

                int index = c - 'a' + i;
                if (index > 26) index = index - 26;

                if (index == 9) {
                    flag = false;
                    break;
                }
            }

            if (flag) cnt++;
        }

        System.out.println(cnt == 0 ? "impossible" : cnt);
    }


}