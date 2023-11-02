import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			
			long X = Long.parseLong(st.nextToken());
			long sqrt = (long)Math.sqrt(X);
			
			while(X < sqrt * sqrt) sqrt -= 1;

			System.out.print((sqrt * sqrt == X ? 1 : 0) + " ");
		}
		
	}

	
}