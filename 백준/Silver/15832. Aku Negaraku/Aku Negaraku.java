import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Queue<Integer> q = new LinkedList<>();
        while (true)
        {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0) break;

            for (int i = 0; i < n; i++) q.offer(i + 1);

            while (n --> 0) {

                for (int i = 0; i < m; i++) {

                    if (i == m - 1)
                    {
                        if (q.size() == 1) bw.write(q.peek() + "\n");
                    }
                    else q.offer(q.peek());
                    q.poll();
                }
            }
        }

        bw.flush();
        bw.close();
    }


}



