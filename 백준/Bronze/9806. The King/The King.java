import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int ans = 0;
		int[] s = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			s[i] = temp;
		}
		
		if(A % 2 != 0) {
			
			for(int i = 0; i < N; i++) {
				if(s[i] > 0) ans += Math.pow(s[i], A);
			}
		}
		
		else  {
			for(int i = 0; i < N; i++) ans += Math.pow(s[i], A);
		}
		
		System.out.println(ans);
	}
}
