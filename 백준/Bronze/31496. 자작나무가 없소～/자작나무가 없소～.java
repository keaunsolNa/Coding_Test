import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        int total = 0;
        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split("_");
            int amount = Integer.parseInt(st.nextToken());
            boolean flag = false;

            for (String temp : str) {

                if(temp.equals(s)) {
                    flag = true;
                    break;
                }
            }

            if(flag) total += amount;

        }

        System.out.println(total);
    }
}