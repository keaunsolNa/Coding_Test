import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   while(true) {
		   st = new StringTokenizer(br.readLine());
		   
		   long A = Long.parseLong(st.nextToken());
		   long B = Long.parseLong(st.nextToken());
		   long C = Long.parseLong(st.nextToken());
		   long D = Long.parseLong(st.nextToken());
		   
		   if(A == 0 && B == 0 && C == 0 && D == 0) break;
		   
		   long sum = (long) Math.pow(A, B);
		   sum = (long) Math.pow(sum, C);
		   sum = (long) Math.pow(sum, D);
		   
		   System.out.println(sum);
	   }
   }
}
