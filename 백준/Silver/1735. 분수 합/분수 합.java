import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int c = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
	   
	   int A = (a * d) + (c * b);
	   int B = b * d;
	   
	   int C = GCD(A, B);
	   
	   System.out.print(A/C);
	   System.out.println(" " + B/C);
   }

   private static int GCD(int a, int b){ 
   
	   if (a%b == 0) return b;
	   return GCD(b, a % b);
   
   }
}
