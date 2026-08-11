import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("# #")) {
			String one = input.split(" ")[0];
			String two = input.split(" ")[1];
			
			int T = Integer.parseInt(br.readLine());
			
			int win = 0;
			for(int i = 0; i < T; i++) {
				st = new StringTokenizer(br.readLine());
				String guess = st.nextToken();
				String answer = st.nextToken();
				
				if(guess.equals(answer)) win++;
			}
			
			sb.append(one + " " + win + " " + two + " " + (T - win) + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
