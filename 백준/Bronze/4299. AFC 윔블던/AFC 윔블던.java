import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   if(A < B) {
		   System.out.println("-1");
	   } else {
		   int X = (A+B)/2;
		   int Y = (A-B)/2;
		   if(X + Y == A && X - Y == B) {
			   System.out.println(X + " " + Y);
		   } else {
			   System.out.println("-1");
		   }
	   }
   }
}
