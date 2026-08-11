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
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   int c = Integer.parseInt(st.nextToken());
		   int P = Integer.parseInt(st.nextToken());
		   
		   long total = 0;
		   for(int i = 1; i <= P; i++)  total += (i+1);
		   
		   sb.append(c + " " + total + "\n");
	   }
	   
	   System.out.print(sb);
	   
   }
}
