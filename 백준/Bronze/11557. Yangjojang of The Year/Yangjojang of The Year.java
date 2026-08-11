import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int max = 0;
			String best ="";
			
			for(int j = 0; j < N; j++) {
				
				String[] temp = br.readLine().split(" ");
				
				if(max < Integer.parseInt(temp[1])) {
					max = Integer.parseInt(temp[1]);
					best = temp[0];
				}
			}
			System.out.println(best);
		}
	}
}
