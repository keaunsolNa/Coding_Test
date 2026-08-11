import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;	   
	   
	   int total = 0;
	   int N = Integer.parseInt(br.readLine());
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   int H = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   int K = Integer.parseInt(st.nextToken());
		   
		   if(H < B) total += ((B - H) * K);
		   
	   }

	   System.out.println(total);
   }
}
