import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        	
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n + 1];
        long sum = 0;
        for (int i = 1; i <= n; i++)
        {
        	
        	boolean isRain = Integer.parseInt(st.nextToken()) == 1;
        	arr[i] = isRain ? arr[i - 1] + 1 : arr[i - 1] - 1;
        	sum += arr[i];
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();

    }
}
