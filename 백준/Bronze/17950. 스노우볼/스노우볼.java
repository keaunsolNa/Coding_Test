import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int H = Integer.parseInt(st.nextToken());
	   int X = Integer.parseInt(st.nextToken());
	   
	   long total = 0;
	   int mod = 1000000007;
	   long num = X;
	   
	   for(int i = 1; i <= H; i++) {
		   int snowBall = Integer.parseInt(br.readLine());
		   
		   total += (num * snowBall);
		   total = total % mod;
		   num = (num * X) % mod;
		   
	   }
	   
	   System.out.println(total);
   }
}
