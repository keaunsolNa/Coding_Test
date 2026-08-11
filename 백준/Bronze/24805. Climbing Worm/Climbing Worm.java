import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long H = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int cur = 0;

		while (true) {
			
			cur += A; 
			cnt++;
			
			if (cur >= H) break;
			cur -= B;
		}
		
		System.out.print(cnt);
   }
}
