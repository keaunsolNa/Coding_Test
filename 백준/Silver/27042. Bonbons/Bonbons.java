import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 1; i <= n; i++)
        {
        	que.offer(i);
        }
        
        while (!(que.size() == 1))
        {
        	que.offer(que.poll());
        	que.poll();
        }
        
        bw.write(String.valueOf(que.poll()));
        bw.flush();
        bw.close();
        br.close();
    }
    
}
