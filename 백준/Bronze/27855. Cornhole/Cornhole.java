import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int A2 = Integer.parseInt(st.nextToken());
	   int B2 = Integer.parseInt(st.nextToken());
	   
	   int AS = 3 * A + B;
	   int BS = 3 * A2 + B2;
	   
	   if(AS > BS) System.out.println(1 + " " + (AS - BS));
	   else if(AS < BS) System.out.println(2 + " " + (BS - AS));
	   else System.out.println("NO SCORE");
	   
   }
}
