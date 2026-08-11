import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			br.readLine();
			System.out.println(2);
			return;
		}
		
		char prev = br.readLine().charAt(0);
		int ans = 2;
		N--;
		while(N --> 0) {
			char input = br.readLine().charAt(0);
			
			if(prev != input) ans++;
			
			prev = input;
		}
		
		System.out.print(ans);
	}
}
