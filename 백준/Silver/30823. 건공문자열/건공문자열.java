import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        k--;
        if ((n - k) % 2 == 0)
            sb.append(str.substring(k)).append(str, 0, k);
        else
            sb.append(str.substring(k)).append(new StringBuilder(str.substring(0, k)).reverse());

        System.out.println(sb);

    }

}