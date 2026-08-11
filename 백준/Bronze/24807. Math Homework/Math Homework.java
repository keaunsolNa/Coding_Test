import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int b = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   int l = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i <= l; i++) {
		   
		   for(int j = 0; j <= l; j++) {
			   
			   for(int q = 0; q <= l; q++) {
				   
				   if((i * b) + (j * d) + (q * c) == l) sb.append(i + " " + j + " " + q + "\n");
			   }
		   }
	   }
	   
	   if(sb.length() == 0) System.out.println("impossible");
	   else System.out.println(sb);
   }
}
