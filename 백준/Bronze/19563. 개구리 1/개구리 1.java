import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   
	   int plus = Math.abs(a) + Math.abs(b);
	   
	   if(plus <= c && ((plus % 2 == 0 && c % 2 == 0) || (plus % 2 != 0 && c % 2 != 0))) System.out.println("YES");
	   else System.out.println("NO");
	   
   }
}
