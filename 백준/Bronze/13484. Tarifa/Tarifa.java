import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		long ans = 0;
		while(N --> 0) {
			int spend = Integer.parseInt(br.readLine());
			ans += X;
			ans = (ans - spend);
		}
		
		System.out.println(ans + X);
	}
}
