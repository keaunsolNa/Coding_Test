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
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		
		M += T / 60;
		S += T % 60;
		
		M += S / 60;
		S = S % 60;

		H += M / 60;
		M = M %60;
		
		H = H % 24;
		System.out.println(H + " " + M + " " + S);
	}
}
