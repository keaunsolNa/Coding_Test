import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
	   int totalCount = 0;
	   int nowCount = 1;
	   for(int i = 0; i < N; i++) {
		   int answer = Integer.parseInt(st.nextToken());
		   
		   if(answer == 1) {
			   totalCount += nowCount;
			   nowCount++;
		   } else {
			   nowCount = 1;
		   }
	   }
	   
	   System.out.println(totalCount);
   }
}
