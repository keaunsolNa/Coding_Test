import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int stress = 0;
    	int ans = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < n; i++) {
    		
    		int get = Integer.parseInt(st.nextToken());
    		stress = Math.max(stress + get, 0);
    		
    		if (stress >= m) ans++;
    	}
    
    	System.out.println(ans);

    }
}
