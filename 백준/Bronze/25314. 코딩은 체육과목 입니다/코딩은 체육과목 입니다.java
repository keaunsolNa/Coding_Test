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
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		if(N%4 != 0) {
			sb.append("long ");
		}
		for(int i = 0; i < N/4; i++) {
			sb.append("long ");
		}
		
		sb.append("int");
		System.out.println(sb);
	}
}
