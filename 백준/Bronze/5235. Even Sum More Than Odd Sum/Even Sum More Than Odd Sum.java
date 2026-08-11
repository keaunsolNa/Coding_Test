import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			int even = 0;
			int odd = 0;
			
			for(int i = 0; i < K; i++) {
				int temp = Integer.parseInt(st.nextToken());
				if(temp % 2 == 0) even += temp;
				else odd += temp;
			}
			
			String ans = (even > odd) ? "EVEN" : even < odd ? "ODD" : "TIE";
			
			sb.append(ans + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
