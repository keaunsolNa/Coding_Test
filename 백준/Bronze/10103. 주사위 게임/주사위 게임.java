import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   
	   int AP = 100;
	   int BP = 100;
	   for(int i = 0; i < n; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   
		   if(a > b) {
			   BP -= a;
		   } else if(a < b) {
			   AP -= b;
		   } 
	   }
	   
	   System.out.println(AP);
	   System.out.println(BP);
   }
}
