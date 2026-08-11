import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String input = "";
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			String day = st.nextToken();
			
			while(st.hasMoreTokens()) {
				
				int temp = Integer.parseInt(st.nextToken());
				min = Math.min(min, temp);
				max = Math.max(max, temp);
				
			}
			
		}
		System.out.println(min + " " + max);
	}
}
