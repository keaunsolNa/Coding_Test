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
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   int[] room = new int[] {0, 0, 0, 0, 0};
	   int ans = 0;
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int S = Integer.parseInt(st.nextToken());
		   int Y = Integer.parseInt(st.nextToken());
		   
		   int idx;
		   if(Y <= 2) idx = 0;
		   else if(Y <= 4 && S == 1) idx = 1;
		   else if(Y <= 4 && S != 1) idx = 2;
		   else if(S == 1) idx = 3;
		   else idx = 4;
		   
		   
		   room[idx]++;
		   
		   if(room[idx] == 1) ans++;
		   
		   if(room[idx] == K) room[idx] = 0;
		   
	   }	
	   
	   
	   System.out.println(ans);
   }
}
