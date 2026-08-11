import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	
        	int N = Integer.parseInt(br.readLine());
        	
        	String winner = "";
        	int maxlength = 0;
        	for(int j = 0; j < N; j++) {
        		
        		String name = br.readLine();
        		Set<Character> nameSet = new HashSet<>();
        		
        		for(int k = 0; k < name.length(); k++) {
        			if(name.charAt(k) != ' ') nameSet.add(name.charAt(k));
        		}
        		
        		if(maxlength < nameSet.size()) {
        			maxlength = nameSet.size();
        			winner = name;
        		} else if(maxlength == nameSet.size()) {
        			if(winner.compareTo(name) > 0) winner = name; 
        		}
        		
        	}
        	
        	sb.append("Case #" + (i+1) + ": " + winner + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
		
	}
}
