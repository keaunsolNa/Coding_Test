import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		
		while(N >= cnt) {
			N -= cnt;
			cnt++;
		}
		
		if((cnt & 1) == 1) System.out.println(cnt - N);
		else System.out.println(0);
   }
}