import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	Map<String, Integer> map = new TreeMap<>();
    	while (n --> 0) {
    		
    		st = new StringTokenizer(br.readLine());

    		String product = st.nextToken();
    		String temp = st.nextToken();
    		boolean plus = temp.charAt(0) == '+';
    		int cnt = Integer.parseInt(temp.substring(1,  temp.length()));
    		cnt = !plus ? -1 * cnt : cnt;
    		map.put(product, map.getOrDefault(product, 0) + cnt);
    	}
    	
    	for (String key : map.keySet()) {
    		sb.append(key).append(" ").append(map.get(key)).append("\n");
    	}
    	
    	System.out.println(sb);
    }
    
    
}
