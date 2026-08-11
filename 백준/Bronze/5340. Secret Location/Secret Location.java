import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("Latitude ");
		
		for(int i = 0; i < 6; i++) {
			String input = br.readLine();

			int len = 0;
			if(input.charAt(input.length() - 1) == ' ') len = input.length() - 1;
			else len = input.length();	
			
			if(i == 3) {
				sb.append("\n");
				sb.append("Longitude ");
			}
			
			sb.append(len);
			
			if(i != 2 && i != 5) sb.append(":");
		}

		System.out.print(sb);
	}
}
