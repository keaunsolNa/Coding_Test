import java.io.*;
import java.util.*;

public class Main {

    private static class Pos {

        private int x;
        private int y;

        public Pos(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer>[] ts = new TreeSet[n + 1];

        Pos[] posArr = new Pos[n];
        for (int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            posArr[i] = new Pos(x, y);
            if (ts[y] == null)
            {
                ts[y] = new TreeSet<>();
                ts[y].add(-1000000);
                ts[y].add(1000000);
            }
            ts[y].add(x);
        }

        int sum = 0;
        for (Pos p : posArr)
        {
            sum += Math.min( Math.abs(p.x - ts[p.y].higher(p.x)), Math.abs(p.x - ts[p.y].lower(p.x)));
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }


}
