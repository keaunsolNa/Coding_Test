import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            String str = br.readLine();
            if (str.equals("0")) break;

            int len = str.length();
            long ans = 0;
            int idx = 0;
            while (len --> 0) {

                ans += (long) ((str.charAt(idx++) - '0') * (Math.pow(2, len + 1) - 1));

            }

            System.out.println(ans);
        }
    }


}
