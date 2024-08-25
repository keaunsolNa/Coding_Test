import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            int point = Integer.parseInt(st.nextToken());
            if (h - point > 0)
            {
                cnt++;
                h -= point;
            }
            else {
                cnt ++;
                h -= point;
                break;
            }
        }

        bw.write(String.valueOf(h > 0 ? -1 : cnt));
        bw.flush();
        bw.close();
    }
}