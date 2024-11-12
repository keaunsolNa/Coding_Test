import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        while (n --> 0)
        {
        	st = new StringTokenizer(br.readLine());
        	
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        
        	min = Math.max(start, min);
        	max = Math.min(end, max);
        	
        }
        
        if (min > max || max < min) bw.write("bad news");
        else bw.write(max - min + 1 + " " + min);
        
        bw.flush();
        bw.close();
        br.close();
    }
}
