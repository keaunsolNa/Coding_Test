import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   long sum = 0;
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) sum += Integer.parseInt(st.nextToken());
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < M; i++) sum += Integer.parseInt(st.nextToken());
	   
	   System.out.println(sum);
   }
}
