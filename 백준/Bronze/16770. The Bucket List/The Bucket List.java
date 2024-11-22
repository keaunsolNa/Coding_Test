import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Integer[] time = new Integer[1001];
        Arrays.fill(time, 0);
        
        while(n --> 0)
        {
        	
        	st = new StringTokenizer(br.readLine());
        	
        	int si = Integer.parseInt(st.nextToken());
        	int ei = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	for (int i = si; i <= ei; i++)
        	{
        		time[i] += b;
        	}
        	
        }
        
        Arrays.sort(time, Collections.reverseOrder());
        bw.write(String.valueOf(time[0]));
        
        bw.flush();
        bw.close();
        br.close();

    }
}
