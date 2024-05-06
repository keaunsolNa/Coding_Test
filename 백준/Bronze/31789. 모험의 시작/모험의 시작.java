import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st;

    	int n = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	int x = Integer.parseInt(st.nextToken());
    	int s = Integer.parseInt(st.nextToken());
    	boolean chk = false;
    	
    	while (n --> 0) {
    		
    		st = new StringTokenizer(br.readLine());
    		int c = Integer.parseInt(st.nextToken());
    		int p = Integer.parseInt(st.nextToken());
    		
    		if (c <= x && s < p) { chk = true; break; };
    	}
    	
    	System.out.println(chk ? "YES" : "NO");
    }
}
