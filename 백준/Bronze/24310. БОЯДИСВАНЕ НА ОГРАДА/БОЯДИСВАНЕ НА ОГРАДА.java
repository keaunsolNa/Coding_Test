import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());

	   boolean[] pence = new boolean [1000000000];
	   for(int i = Math.min(A, B); i <= Math.max(A, B); i++) pence[i] = true;
	   for(int i = Math.min(C, D); i <= Math.max(C, D); i++) pence[i] = true;
	   
	   int ans = 0;
	   for(int i = 0; i < pence.length; i++) if(pence[i] == true) ans++;
	   
	   System.out.println(ans);
		   
   }
}
