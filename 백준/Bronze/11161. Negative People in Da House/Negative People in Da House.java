import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   int M = Integer.parseInt(br.readLine());
           int people = 0;
           int minPeople = 0;
           
		   for(int i = 0; i < M; i++) {
			   st = new StringTokenizer(br.readLine());
			   
			   int in = Integer.parseInt(st.nextToken());
			   int out = Integer.parseInt(st.nextToken());
			   
               people += (in - out);
               minPeople = Math.min(minPeople, people);
               
		   }
		   
		   System.out.println(Math.abs(minPeople));
	   }

	   
   }
}
