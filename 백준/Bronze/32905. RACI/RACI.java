import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean flag = true;

        for (int i = 0; i < n; i++)
        {

            st = new StringTokenizer(br.readLine().toUpperCase());
            char[] arr = new char[26];
            while (st.hasMoreTokens())
            {
                char temp = st.nextToken().charAt(0);
                if (temp != '-')
                {
                    arr[temp - 'A']++;
                }
            }


            if (arr[0] != 1) flag = false;
        }

        bw.write(flag ? "Yes" : "No");
        bw.flush();
        br.close();
    }



}
