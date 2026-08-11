import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	
        	String input = br.readLine();
        	sb.append("Case #").append(i + 1).append(": ").append(input).append(" is ruled by ");
        	char last = input.toLowerCase().charAt(input.length() - 1);
        	switch(input.toLowerCase().charAt(input.length() - 1)) {

        		case 'y' : sb.append("nobody."); break;
        		case 'a' : sb.append("a queen."); break;
        		case 'e' : sb.append("a queen."); break;
        		case 'i' : sb.append("a queen."); break;
        		case 'o' : sb.append("a queen."); break;
        		case 'u' : sb.append("a queen."); break;
        		default : sb.append("a king."); break;
        	}
        	
        	sb.append("\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        
        System.out.print(sb);
	}
}
