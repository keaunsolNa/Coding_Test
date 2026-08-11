import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a1 = Integer.parseInt(st.nextToken());
	   int a0 = Integer.parseInt(st.nextToken());
	   
	   int c = Integer.parseInt(br.readLine());
	   int n0 = Integer.parseInt(br.readLine());
	   
       int result = (a1 * n0 + a0 <= c * n0) && (c >= a1)?1:0;
       System.out.println(result);
   }
}
