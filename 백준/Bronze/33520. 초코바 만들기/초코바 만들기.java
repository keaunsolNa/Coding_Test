import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long w = 0;
        long h = 0;
        
        while (n --> 0)
        {
        	st = new StringTokenizer(br.readLine());
        	long a = Integer.parseInt(st.nextToken());
        	long b = Integer.parseInt(st.nextToken());
        	
        	w = Math.max(w, Math.min(a, b));
        	h = Math.max(h, Math.max(a, b));
        }

        bw.write(String.valueOf(w * h));
        bw.flush();
        bw.close();
        br.close();
    }
	
}
