import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());

    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	Map<String, String> map = new HashMap<>();
    	for (int i = 0; i < n; i++) {
    		
    		st = new StringTokenizer(br.readLine());
    		map.put(st.nextToken(), st.nextToken());
    	}


    	for (int i = 0; i < m; i++) {
    		String str = br.readLine();
    		StringBuilder in = new StringBuilder();

    		for (int j = 0; j < str.length(); j++) {

    			for (int k = j + 1; k <= str.length(); k++) {
    				
    				String temp = str.substring(j, k);
    				if(map.containsKey(temp)) in.append(map.get(temp));
    			}
    		}
    		
    		if (in.length() == 0) out.append("-1");
    		else out.append(in);
    		
    		out.append("\n");
    	}
    	
    	System.out.println(out);
    }
}
