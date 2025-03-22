import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()) - 1;
        st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(first));

        while (n --> 0)
        {
            int t = Integer.parseInt(st.nextToken());
            if (first <= t)
            {
                bw.write(" " + t);
                first = t;
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }


}