import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int max = 0;
		int winner = 0;
		for(int i = 1; i <= 5; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int sum = 0;
			
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			if(sum > max) {
				max = sum;
				winner = i;
			}
		}
		
		System.out.println(winner + " " + max);
		
	}
}
