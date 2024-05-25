import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());

    	StringTokenizer st1	= new StringTokenizer(br.readLine());
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	
    	Map<String, String> map = new HashMap<>();
    	boolean ans = true;
    	for (int i = 0; i < n; i++) {
    		
    		String name1 = st1.nextToken();
    		String name2 = st2.nextToken();
    		
    		if (name1.equals(name2)) {
    			
    			ans = false;
    			break;
    		};
    		
    		if (map.containsKey(name2) && !(map.get(name2).equals(name1))) {
    			ans = false;
    			break;
    		};
    		
    		map.put(name1, name2);
    		
    	}
    	
    	System.out.println(ans ? "good" : "bad");
    }
    
    
}
