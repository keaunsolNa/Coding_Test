import java.io.*;
import java.util.*;

public class Main {

    private static class People implements Comparable<People> {

        int idx;
        int v;
        int p;
        int s;
        int sum;

        public People(int idx, int v, int p, int s) {
            this.idx = idx;
            this.v = v;
            this.p = p;
            this.s = s;
            this.sum = this.v + this.p + this.s;
        }

        @Override
        public int compareTo(People o) {
            return Integer.compare(o.sum, this.sum);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int zv = Integer.parseInt(st.nextToken());
        int zp = Integer.parseInt(st.nextToken());
        int zs = Integer.parseInt(st.nextToken());
        People zo = new People(0, zv, zp, zs);

        PriorityQueue<People> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if (v + p + s <= zo.sum)
            {
                pq.add(new People(i, v, p, s));
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        m--;
        while (!pq.isEmpty() && m != 0)
        {

            People p = pq.poll();
            ans.add(p.idx);
            m--;
            if (m == 0) break;

        }

        Collections.sort(ans);
        for (int i : ans)
        {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
