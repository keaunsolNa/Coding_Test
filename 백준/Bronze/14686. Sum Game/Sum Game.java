import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());

	   long[] swifts = new long[N];
	   long[] semaphores = new long[N];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) swifts[i] = Integer.parseInt(st.nextToken());
	   for(int i = 1; i < N; i++) swifts[i] += swifts[i - 1];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) semaphores[i] = Integer.parseInt(st.nextToken());
	   for(int i = 1; i < N; i++) semaphores[i] += semaphores[i - 1];
	   
	   int max = 0;
	   for(int i = 0; i < N; i++) if(swifts[i] == semaphores[i]) max = (i + 1);
	   
	   System.out.println(max);
   }
}
