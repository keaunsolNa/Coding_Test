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
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for(int i = 1; i <= T; i++) {
			
			if(i != Integer.parseInt(st.nextToken())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
