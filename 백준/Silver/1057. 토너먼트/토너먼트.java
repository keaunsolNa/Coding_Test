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
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int one = Integer.parseInt(st.nextToken());
	   int two = Integer.parseInt(st.nextToken());
	   
	   int round = 0;
	   while(one != two) {
		   
		   one = one - one / 2;
		   two = two - two / 2;
		   round++;
	   }
	   
	   System.out.println(round);
	   
   }
}
