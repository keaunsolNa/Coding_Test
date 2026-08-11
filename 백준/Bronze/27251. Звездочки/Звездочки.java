import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
				if(i > 10) {
					for(int k = 0; k < 100; k++) sb.append("*");
					sb.append("...");
				} else {
					for(int j = 0; j < i * i; j++) sb.append("*");
				}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
