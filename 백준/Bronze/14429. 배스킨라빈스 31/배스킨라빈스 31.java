import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0, games = 0;
        
        int[] ans = new int[] { 0, 10001 };
        
        while (n --> 0)
        {
        	
        	games++;
        	st = new StringTokenizer(br.readLine());
        	
        	int j = Integer.parseInt(st.nextToken());
        	int m = Integer.parseInt(st.nextToken());
        	
        	int winNumber = (j - 1) % (1 + m);

        	cnt++;
        	
        	while (winNumber != j - 1)
        	{
        		winNumber = winNumber + (1 + m);
        		cnt = cnt + 2;
        	}
        	
        	cnt++;
        	
        	if (cnt < ans[1])
        	{
        		ans[0] = games;
        		ans[1] = cnt;
        	}

        	cnt = 0;
        			
        }
        
        bw.write(ans[0] + " " + ans[1]);
        bw.flush();
        bw.close();
        br.close();

    }
    
    
}
