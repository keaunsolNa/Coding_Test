import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		List<Long> facList = new ArrayList<>();
		
		for(long i = 0; i < N; i++) {
			
			long fac = factorial(i);
			if(fac > N) break;
			facList.add(fac);
		}
		
		String ans = "NO";
		for(int i = facList.size() - 1; i >= 0; i--) {
			
			if(facList.get(i) <= N) N -= facList.get(i);
			
			if(N == 0) { ans = "YES"; break; }
		}
		System.out.println(ans);
	}

	private static long factorial(long n) {
			
		if(n < 2) return 1;
		return n * factorial(n - 1);
		
	}
}
