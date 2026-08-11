import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int house = N + 1;
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int max = 0;
	   for(int i = 1; i <= N; i++) {
		   
		   int tree = Integer.parseInt(st.nextToken());
		   
		   max = Math.max(max, i - house + tree);
	   }
	   
	   System.out.println(max);
   }
}
