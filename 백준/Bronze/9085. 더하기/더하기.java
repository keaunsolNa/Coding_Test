import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   
		   int N  = Integer.parseInt(br.readLine());
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int sum = 0;
		   for(int j = 0; j < N; j++) {
			   sum += Integer.parseInt(st.nextToken());
		   }
		   
		   System.out.println(sum);
	   }
	   
   }
}
