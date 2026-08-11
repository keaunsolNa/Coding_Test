import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine());
		
		int P = 5*B-400;
		System.out.println(P);
		
		if(P == 100) {
			System.out.println(0);
		} else if(P > 100) {
			System.out.println(-1);
		} else {
			System.out.println(1);
		}
	}
}
