import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int total = 0;
        int now = s;
        for (int i = 0; i < n; i++) {

            String input = br.readLine();

            int water = input.length() == 1 ? Integer.parseInt(input) : (input.charAt(0) - '0') + 1;
            if(now - water < 0) { now = s; total++; }
            now -= water;

        }

        System.out.println(total);

    }



}