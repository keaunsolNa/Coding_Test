import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int squre = 1;
	   int side = 0;
	   for(int i = 1; i <= N; i++) {
		   squre *= 4;
		   side = (int)Math.sqrt(squre);
	   }
	   
	   System.out.println((side+1) * (side+1));
   }
}
