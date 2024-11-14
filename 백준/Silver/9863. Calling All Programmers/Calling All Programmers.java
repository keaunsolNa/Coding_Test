import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true)
        {
        	st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (n == 0) break;
            
            Queue<Integer> q = new ArrayDeque<>();
            for (int i = 1; i <= n; i++)
            {
            	q.offer(i);
            }
            
            while (k --> 0)
            {

            	for (int i = 1; i < m; i++) q.offer(q.poll());
            	if (k > 0) q.poll();
            }
            
            bw.write(q.poll() + "\n");
        }
        

        bw.flush();
        bw.close();
        br.close();
    }
    
}
