import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	while(true) {
    		
    		st = new StringTokenizer(br.readLine());
    		
    		String plane = st.nextToken();
    		int n = Integer.parseInt(st.nextToken());
    		int ans = n;
    		
    		if(plane.equals("#") && n == 0) break;
    		
    		while(true) {
    			
    			st = new StringTokenizer(br.readLine());
    			char order = st.nextToken().charAt(0);
    			int number = Integer.parseInt(st.nextToken());
    			
    			if(order == 'X' && number == 0) break;

    			if(order == 'B' && ans + number <= 68) ans += number;
    			
    			if(order == 'C' && ans - number >= 0) ans -= number;
    		}
    		
    		sb.append(plane).append(" ").append(ans).append("\n");
    		
    	}

    	System.out.print(sb.deleteCharAt(sb.length() - 1));
    }
}
