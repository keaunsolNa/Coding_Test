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
		int T = Integer.parseInt(br.readLine());
		
		int Q = 0;
		int NQ = 0;
		for(int i = 0; i < T; i++) {
			int answer = Integer.parseInt(br.readLine());
			
			if(answer == 1) {
				Q++;
			} else {
				NQ++;
			}
		}
		
		if(Q > NQ) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
	}
}
