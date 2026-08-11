import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int prime = 0;
	   
	   for(int i = 0; i < N; i++) {
		   
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   int C = Integer.parseInt(st.nextToken());
		   int K = Integer.parseInt(st.nextToken());
		   
		   prime += C * K ;
	   }
	   
	   System.out.println(prime);
   }
}
