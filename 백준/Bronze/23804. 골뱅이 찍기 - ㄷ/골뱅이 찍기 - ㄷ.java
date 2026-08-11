import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 0; k < T; k++) {
			for(int j = 0; j < T; j++) for(int i = 0; i < 5; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int j = 0; j < 3*T; j++) {
			for(int i = 0; i < T; i++) sb.append("@");
			sb.append("\n");
		}
		
		for(int k = 0; k < T; k++) {
			for(int j = 0; j < T; j++) for(int i = 0; i < 5; i++) sb.append("@");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
