import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int cnt = 0;
	   for(int i = 3; i < N; i += 3) {
		   
		   for(int j = 3; j < N; j+= 3) {
			   if(i + j >= N) break;
			   for(int k = 3; j < N; k+= 3) {
				   if(i + j + k == N) cnt++;
				   if(i + j + k >= N) break;
			   }
		   }
	   }
	   
	   System.out.println(cnt);
   }
}
