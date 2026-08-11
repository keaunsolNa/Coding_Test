import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   long A = Long.parseLong(st.nextToken());
	   long B = Long.parseLong(st.nextToken());
	   
	   long gcd = gcd(A, B);
	   System.out.println(A * B / gcd);
	   
   }

   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
}
