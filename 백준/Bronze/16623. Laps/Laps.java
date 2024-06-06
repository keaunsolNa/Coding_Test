import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());

    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int cnt = 0;
    	int prev = Integer.parseInt(st.nextToken());
    	for (int i = 1; i < m; i++) {
    		
    		int now = Integer.parseInt(st.nextToken());
    		if (now < prev) cnt++;
    		
    		prev = now;
    	}
    	
    	System.out.println(cnt);
    	
    }
    
    
}
