import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;

	   int M = Integer.parseInt(br.readLine());
	   int belt = 0;
	   int beltm = 1;

	   for(int i = 0; i < M; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
			
		   if(c == 1) {
			   if(belt == 0) belt = 1;
			   else if(belt == 1) belt = 0;
		   }
			
			beltm = (beltm / a) * b;

	   }
	   System.out.println(belt + " " + beltm);
  
   }
}
