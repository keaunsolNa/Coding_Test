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
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			double r = 0;
			double g = 0;
			double b = 0;
			for(int j = 0; j < 10; j++) {
				
				st = new StringTokenizer(br.readLine());
				r += Integer.parseInt(st.nextToken());
				g += Integer.parseInt(st.nextToken());
				b += Integer.parseInt(st.nextToken());
				
			}
			
			System.out.println(Math.round(r / 10) + " " + Math.round(g / 10) + " " + Math.round(b / 10));
			
		}

	}
}
