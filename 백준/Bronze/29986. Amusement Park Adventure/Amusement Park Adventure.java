import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		while(N --> 0) {
			
			int min = Integer.parseInt(st.nextToken());
			if(min <= H) ans++;
		}
		
		System.out.println(ans);
   }
}