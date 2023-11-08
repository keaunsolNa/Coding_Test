import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		
		int cnt = 0;
		while(N > 3) {
			cnt++;
			N = N/2 + (N % 2 == 1 ? 1 : 0);
		}
		
		System.out.println(cnt + N);
   }
}