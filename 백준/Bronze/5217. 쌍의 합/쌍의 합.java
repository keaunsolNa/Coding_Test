import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int input = Integer.parseInt(br.readLine());
			
			sb.append("Pairs for ").append(input).append(": ");
			boolean flag = false;
			for(int i = 1; i <= input; i++) {
				
				for(int j = i + 1; j <=input; j++) {
					
					if(i + j == input) {
						
						if(flag) sb.append(", ");
						sb.append(i + " " + j);
						if(!flag) flag = true;
					}
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
