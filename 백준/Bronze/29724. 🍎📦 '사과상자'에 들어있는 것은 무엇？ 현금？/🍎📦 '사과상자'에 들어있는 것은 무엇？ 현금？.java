import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		long totalW = 0;
		long totalM = 0;
		
		for(int i = 0; i < N; i++ ) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char T = st.nextToken().charAt(0);
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());

			int count = (W / 12) * (H / 12) * (L / 12);
			
			totalW += T == 'B' ? 6000 : 1000 + (count * 500);
			totalM += T == 'A' ? count * 4000 : 0;
		}

		System.out.println(totalW);
		System.out.println(totalM);
   }
}