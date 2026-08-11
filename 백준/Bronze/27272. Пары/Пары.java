import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	  
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());
	   
	   System.out.println(Math.max((A * B + C * D), Math.max(A * C + B * D, A * D + B * C)));
	   
   }
}
