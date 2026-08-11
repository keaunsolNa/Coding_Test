import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int x = Integer.parseInt(st.nextToken());
	   int y = Integer.parseInt(st.nextToken());
	   
	   double per = (double)y / x;

	   for(int i = 0; i < N; i++) {
		   double need = Integer.parseInt(br.readLine());
		   
		   System.out.println(Math.round(per * need));
	   }
   }
}
