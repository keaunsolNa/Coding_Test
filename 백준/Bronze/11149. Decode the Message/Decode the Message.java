import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st;

    	int t = Integer.parseInt(br.readLine());
    	char[] alp = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',  'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
    	
    	while (t --> 0) {
    		
    		st = new StringTokenizer(br.readLine());
    		StringBuilder sb = new StringBuilder();
    		
    		while (st.hasMoreTokens()) {
    			
    			int total = 0;
    			char[] temp = st.nextToken().toCharArray();
    			
    			for (int i = 0; i < temp.length; i++) total += (int) (temp[i] - 'a');
    				
    			total %= 27;
    			
    			sb.append(alp[total]);
    		}
    		
    		out.append(sb).append("\n");
    	}

    	System.out.print(out);
    }
}
