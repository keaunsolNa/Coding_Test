import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String input = "";
		while(!(input = br.readLine()).equals("0 0 0")) {
			st = new StringTokenizer(input);
			int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			int cypher = sum % 25 + 1;
			
			String text = br.readLine();
			
			for(int i = 0; i < text.length(); i++) {
				int charInt = (int)text.charAt(i);
				if(charInt < 123 && charInt > 96) {	
					
					if(charInt - cypher < 123 && charInt - cypher > 96) {
						
						sb.append((char)(charInt - cypher));
						continue;
						
					} else {
						
						sb.append((char)(26 + charInt - cypher));
						continue;
					}
				}  else {
					sb.append(text.charAt(i));
				}
				
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
    }
}
