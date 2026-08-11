import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String input1 = st.nextToken();
		String input2 = st.nextToken();
		
		int len = Math.min(input1.length(), input2.length());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < len; i++) {
			
			if(i % 2 == 0) sb.append(input1.charAt(i));
			else sb.append(input2.charAt(i));
		}
		
		System.out.println(sb);
		
		
	}
}
