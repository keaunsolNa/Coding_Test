import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   int odd = 0;
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(br.readLine());
		   
		   while(temp % 2 == 0) {
			   odd++;
			   temp /= 2;
		   }
	   }
	   
	   if(odd >= K) System.out.println(1);
	   else System.out.println(0);
   }
}
