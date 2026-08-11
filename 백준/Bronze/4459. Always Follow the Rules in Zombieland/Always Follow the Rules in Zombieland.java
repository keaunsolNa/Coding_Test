import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String[] text = new String[T];
		
		for(int i = 0; i < T; i++) text[i] = br.readLine();
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int input = Integer.parseInt(br.readLine());
			
			sb.append("Rule ").append(input).append(": ");
			input--;
			try {
				if(!text[input].isBlank()) sb.append(text[input]);
			} catch(java.lang.ArrayIndexOutOfBoundsException e) {
				sb.append("No such rule");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
