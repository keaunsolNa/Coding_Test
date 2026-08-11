import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int QA = Integer.parseInt(input[0]);
			String Q = input[1];
			
			if(Q.equals("N")) {
				
				String[] number = br.readLine().split(" ");
				
				for(int j = 0; j < QA; j++) {
					char temp =  (char)(Integer.parseInt(number[j]) + 64);
					sb.append(temp + " ");
				}
				
				sb.append("\n");
				
			} else {
				
				String[] number = br.readLine().split(" ");
				for(int j = 0; j < QA; j++) 
					sb.append((int)number[j].charAt(0) - 64).append(" ");
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
