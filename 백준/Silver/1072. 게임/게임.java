import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long X = Long.parseLong(st.nextToken());
		long Y = Long.parseLong(st.nextToken());
		long Z;
		
		if(X == Y) System.out.println(-1);

		else {
			
			Z = 100 * Y / X;
			
			if(Z == 99) System.out.println(-1);
			else {
				
				long A = (X * Z + X - 100 * Y);
				long B = 99 - Z;
				long C = A / B;
				
				if(A % B == 0) System.out.println(C);
				else System.out.println(C + 1);
			}
		}
   }
}