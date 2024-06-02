import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;

    	int t = Integer.parseInt(br.readLine());

    	while (t --> 0) {
    		
    		br.readLine();
    		st = new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken());
    		int m = Integer.parseInt(st.nextToken());
    		
    		Set<String> name = new HashSet<>();
    		st = new StringTokenizer(br.readLine());
    		while (n --> 0) name.add(st.nextToken());
    		st = new StringTokenizer(br.readLine());
    		while (m --> 0) name.add(st.nextToken());
    		
    		sb.append(name.size()).append("\n");
    		
    	}
    	
    	System.out.print(sb);
    }
    
    
}
