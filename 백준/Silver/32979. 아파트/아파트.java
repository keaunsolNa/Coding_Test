import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++)
        {
        	arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] loser = new int[t];
        int prev = 0;
        for (int i = 0; i < t; i++)
        {
        	int b = Integer.parseInt(st.nextToken()) - 1;
        	loser[i] = arr[(prev + b) % (2 * n)];
        	bw.write(loser[i] + " ");
        	prev = (prev + b) % (2 * n);
        }
        
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}
