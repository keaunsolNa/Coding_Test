import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;

    	int c = Integer.parseInt(br.readLine());
    	
    	while (c --> 0) {
    		
    		Set<String> allTeam = new HashSet<>();
    		Set<String> loseTeam = new HashSet<>();
    		for (int i = 0; i < 16; i++) {

    			st = new StringTokenizer(br.readLine());
    			String t1 = st.nextToken();
    			String t2 = st.nextToken();
    			int g1 = Integer.parseInt(st.nextToken());
    			int g2 = Integer.parseInt(st.nextToken());

    			allTeam.add(t1);
    			allTeam.add(t2);
    			
    			if (g1 > g2) loseTeam.add(t2);
    			else loseTeam.add(t1);
    			
    		}
    		
    		allTeam.removeAll(loseTeam);

    		Iterator<String> iter = allTeam.iterator();

    		sb.append(iter.next()).append("\n");
    	}
    	
    	System.out.print(sb);
    	
    }
    
    
}
