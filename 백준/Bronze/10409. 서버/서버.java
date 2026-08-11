import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int T = Integer.parseInt(st.nextToken());
	   int answer = 0;
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   T -= Integer.parseInt(st.nextToken());
		   
		   if(T < 0) {
			   break;
		   }
		   answer++;
	   }
	
	   System.out.println(answer);
   }
}
