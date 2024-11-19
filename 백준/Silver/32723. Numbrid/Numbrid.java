import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int min = 10000001;
        int max = 0;
        boolean[] arr = new boolean[min];
        for (int i = 0; i < n; i++)
        {
            int temp = Integer.parseInt(st.nextToken());
            arr[temp] = true;
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }

        int cnt = 0;
        for (int i = min; i <= max; i++)
        {
            if (!arr[i])
            {
                cnt++;
                sb.append(i).append(" ");
            }
        }

        sb.insert(0, cnt + "\n");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
