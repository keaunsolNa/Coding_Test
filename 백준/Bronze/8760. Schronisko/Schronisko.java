import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int W = Integer.parseInt(st.nextToken());
		   int K = Integer.parseInt(st.nextToken());
		   int space = W*K/2;
		   
		   System.out.println(space);
	   }
       
       
   }
}
