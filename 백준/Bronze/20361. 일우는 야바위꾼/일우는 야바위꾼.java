import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int X = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   while(K --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   int b1 = Integer.parseInt(st.nextToken());
		   int b2 = Integer.parseInt(st.nextToken());
		   
		   if(X == b1) X = b2;
		   else if(X == b2) X = b1;
	   }
       
	   System.out.println(X);
   }
}
