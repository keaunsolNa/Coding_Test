import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        int idx = 1;
        while(!(input = br.readLine()).equals("# #")) {
        	sb.append("Case ").append(idx).append("\n");
        	String[] replace = input.split(" ");
        	
        	int T = Integer.parseInt(br.readLine());
        	
        	for(int i = 0; i < T; i++) {
        		String text = br.readLine();
        		
        		text = text.replaceAll(replace[0], "_");
        		text = text.replaceAll(replace[0].toUpperCase(), "_");
        		text = text.replaceAll(replace[1], "_");
        		text = text.replaceAll(replace[1].toUpperCase(), "_");
        		
        		sb.append(text);
        		
        		if(i != T-1) sb.append("\n");
        	}
        	
        	idx++;
        	sb.append("\n");
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
}
