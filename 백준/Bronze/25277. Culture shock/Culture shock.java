import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int shock = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < testCase; i++) {
			String temp = st.nextToken();
			
			if(temp.equals("he") || temp.equals("him") || temp.equals("she") || temp.equals("her")) {
				shock++;
			}
		}
		
		System.out.println(shock);
			
	}
}
