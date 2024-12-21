import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        if (y3 <= y1 && y2 <= y4)
        {
            if (x3 < x2 && x2 < x4) x2 = x3;
            if (x1 < x4 && x3 < x1) x1 = x4;
        }

        if (x3 <= x1 && x2 <= x4)
        {
            if (y3 < y2 && y2 < y4) y2 = y3;
            if (y1 < y4 && y3 < y1) y1 = y4;
        }

        bw.write(String.format("%d\n",(x2 - x1) * (y2 - y1)));
        bw.flush();
        bw.close();
        br.close();

    }

}
