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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		System.out.println("int a;");
		System.out.println("int *ptr = &a;");
		if(N > 1) {
			StringBuilder sb = new StringBuilder();
			for(int i = 2; i <= N; i++) {
				sb.append("int ");
				for(int j = N - (i-1); j <= N; j++) {
					sb.append("*");
				}
				sb.append("ptr").append(i).append(" = &ptr");
				if(i-1 != 1) {
					sb.append(i-1);
				}
				sb.append(";").append("\n");
				
			}
			System.out.println(sb);
		}
	}
}
