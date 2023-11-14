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
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] group = new int[N];
		for(int i = 0; i < N; i++) group[i] = Integer.parseInt(st.nextToken());
			
		int now = 0;
		int min = 0;
		for(int i = 0; i < N; i++) {
			
			if(now + group[i] <= M) {
				System.out.println(min);
				now += group[i];
			}
			else {
				min++;
				now = group[i];
				System.out.println(min);
			}
		}
   }
}