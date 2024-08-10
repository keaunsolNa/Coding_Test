import java.io.*;
import java.util.*;

public class Main {

    private static class Nest implements Comparable<Nest>
    {

        int have;
        int fall;
        int term;

        Nest (int have, int fall)
        {
            this.have = have;
            this.fall = fall;
            this.term = fall - have;
        }

        @Override
        public int compareTo(Nest o) {
            return this.term - o.term;
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] b = new int[n];
        for (int i =0 ; i < n; i++) b[i] = Integer.parseInt(st.nextToken());

        PriorityQueue<Nest> nests = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
        {
            nests.add(new Nest(a[i], b[i]));
        }

        while (!nests.isEmpty())
        {

            Nest nest = nests.poll();
            if (nest.term <= m)
            {
                m += nest.have;
            }
            else
            {
                break;
            }
        }

        bw.write(String.valueOf(m));
        bw.flush();
        bw.close();
    }



}

