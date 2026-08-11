import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(long ans = N; ans < Long.MAX_VALUE; ans++) {
			
			int sum = 0;
			for(int i = 0; i < (ans+"").length(); i++) 
				sum += Character.getNumericValue((ans+"").charAt(i));
			
			
			if(ans % sum == 0) {
				System.out.println(ans);
				return;
			}
		}
		
	}
}
