import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {

            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            st = new StringTokenizer(br.readLine());
            StringBuilder str = new StringBuilder();

            for(int i = 0; i < n; i++) str.append(st.nextToken());

            String temp = str.toString();
            int cnt = 0;

            for(int i = 0; i < temp.length() - 3; i++) {

                if(temp.startsWith("2020", i)) cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }

}