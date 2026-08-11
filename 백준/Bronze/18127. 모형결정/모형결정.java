import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int A = Integer.parseInt(st.nextToken());
	   long B = Long.parseLong(st.nextToken());
	   
	   long answer = 0;
	   long num = 1;

	   while(B --> -1) {
		
		   answer += num;
			
		   num += (A - 2);

	   }

	   System.out.print(answer);
   }
}
