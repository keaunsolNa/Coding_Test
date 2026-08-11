import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long m = Long.parseLong(st.nextToken());
		long seed = Long.parseLong(st.nextToken());
		long x1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken());
		
		for(long a = 0; a < m; a++) {
			
			for(long c = 0; c < m && ((seed - x1) * a + x2 - x1) % m == 0; c++ ) {
				
				if((x1 + x2) % m == (a * (seed + x1) + 2 * c) % m) {
					System.out.println(a + " " + c);
					return;
				}
			}
		}
		
	}
}
