import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long m = Long.parseLong(st.nextToken());
		long seed = Long.parseLong(st.nextToken());
		long x1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken());
		for(int a = 0; a < m; a++) {
			
			for(int c = 0; c < m; c++) {
				
				if((a * seed + c) % m == x1) {
					
					if((a * x1 + c) % m == x2) {
						System.out.println(a + " " + c);
						return;
					}
				}
			}
		}
	}
}
