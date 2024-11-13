import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        while (n --> 0)
        {
        	
        	int cost = Integer.parseInt(br.readLine());
        	min = Math.min(min, cost);
        	max = Math.max(max, cost);
        }
        
        
        bw.write(String.valueOf(Math.max(min - max / 2, 0)));
        bw.flush();
        bw.close();
        br.close();
    }
    
}
