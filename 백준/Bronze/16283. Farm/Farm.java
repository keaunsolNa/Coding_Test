import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int n = Integer.parseInt(st.nextToken());
	   int w = Integer.parseInt(st.nextToken());
	   
	   int cnt = 0;
	   for(int i = 1; i < n; i++) {
		   
		   for(int j = 1; j < n; j++) {
			   if(i + j != n) continue;
			   if(i * a + j * b == w) {
				   sb.append(i + " " + j);
				   cnt++;
			   }
			   
		   }
		   
		   if(cnt > 1) break;
	   }
	   
	   if(cnt == 1) System.out.println(sb);
	   else System.out.println(-1);
   }
}
