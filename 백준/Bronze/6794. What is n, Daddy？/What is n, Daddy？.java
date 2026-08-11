import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int cnt = 0;
	   for(int i = 0; i <= 5; i++) {
		   
		   for(int j = i; j <= 5; j++) {
			   
			   if(i + j == N) {
				   cnt++;
			   }
		   }
	   }
	   
	   System.out.println(cnt);
   }
}
