import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++){
		   
		   int sum = 0;
		   int min = 101;
		   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
		   for(int j = 0; j < 7; j++) {
			   int temp = Integer.parseInt(st.nextToken());
			   if(temp%2 == 0) {
				   sum += temp;
				   
				   if(temp < min) {
					   min = temp;
				   }
			   }
		   }
		   
		   System.out.println(sum + " " + min);
	   }
	   
   }
}
