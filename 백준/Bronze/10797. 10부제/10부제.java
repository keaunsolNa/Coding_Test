import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(N == temp) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
