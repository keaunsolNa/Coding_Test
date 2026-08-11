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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		if(C < 0 && D >= 10) {
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		} else if(A > C) {
			System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		} else if(A <= C && B < D) {
			System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		} else {
			System.out.println("No message");
		}
	}
}
