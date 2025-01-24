import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) que.add(Integer.parseInt(st.nextToken()));

        while (!que.isEmpty())
        {
            Queue<Integer> newQue = new LinkedList<>();
            int prev = que.poll();

            for (int i = 0; i < n - 1; i++)
            {
                int now = que.poll();

                newQue.add(prev + now);
                prev = now;
            }

            for (Integer integer : newQue)
            {
                bw.write(integer + " ");
            }
            bw.write("\n");
            que = newQue;
            n--;
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
