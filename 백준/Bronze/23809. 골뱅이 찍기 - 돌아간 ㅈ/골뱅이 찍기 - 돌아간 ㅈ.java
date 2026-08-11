import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");

		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 2 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 2 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");

		}
		
		System.out.println(sb);
		
	}
}
