import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        while (x --> 0)
        {
            sb.append("1");
        }

        x = Integer.parseInt(sb.toString());
        sb.setLength(0);

        while (y --> 0)
        {
            sb.append("1");
        }

        y = Integer.parseInt(sb.toString());

        bw.write(String.valueOf(x + y));
        bw.flush();
        bw.close();
        br.close();
    }
}