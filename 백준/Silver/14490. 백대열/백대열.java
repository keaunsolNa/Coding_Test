import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int gcd = gcd(Math.min(n, m), Math.max(n, m));
		
		System.out.println(n/gcd + ":" + m/gcd );
	}

	private static int gcd(int a, int b) { 
		
		while(b != 0) { 
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
}
