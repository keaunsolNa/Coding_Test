import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        while(true) {

            int n = Integer.parseInt(br.readLine());
            StringBuilder in = new StringBuilder();
            if(n == 0) break;

            int start = 1;
            int end = 50;


            while(start <= end) {

                int mid = (start + end) / 2;
                in.append(mid).append(" ");

                if(mid == n) break;

                if(mid < n) start = mid + 1;
                else end = mid - 1;
            }

            out.append(in).append("\n");
        }

        System.out.println(out);

    }
}