import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < T; j++) {
			for(int i = 0; i < 5 * T; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 4 * T; j++) {
			for(int i = 0; i < T; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
