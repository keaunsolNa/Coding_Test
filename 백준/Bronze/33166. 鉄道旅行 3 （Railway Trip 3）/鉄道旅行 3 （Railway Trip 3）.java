import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if (p >= q)
        {
        	bw.write(String.valueOf(q * a));
        }
        else 
        {
        	bw.write(String.valueOf((p * a) + ((q - p) * b)));
        }
        bw.flush();
        bw.close();
        br.close();
   
    }
}
