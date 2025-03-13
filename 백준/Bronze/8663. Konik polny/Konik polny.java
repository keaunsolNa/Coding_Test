import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while (x > 0)
        {
            x -= s;
            s /= 2;
            cnt++;

            if (s <= 1)
            {
                cnt += x;
                break;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        br.close();
        bw.close();
    }

}