import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		int ans = 0;
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			
			String EOS = st.nextToken();
			int floor = Integer.parseInt(st.nextToken());
			
			ans += EOS.equals("Es") ? floor * 21 : floor * 17;
		
		}
		
		System.out.println(ans);
	}
}
