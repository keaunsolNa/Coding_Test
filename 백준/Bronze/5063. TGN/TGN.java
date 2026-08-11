import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < N; i++) {
		   
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int r = Integer.parseInt(st.nextToken());
		   int e = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
		   
		   if(e - c > r) {
			   System.out.println("advertise");
		   } else if(e - c == r) {
			   System.out.println("does not matter");
		   } else if(e - c < r) {
			   System.out.println("do not advertise");
		   }
	   }
	   

   }
}
