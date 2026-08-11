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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		

		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			sb.append("Case " + i + ": ");
			sb.append(n - 1 + " ");
			
            for (int j = n; j >= 0; j--) {
            	
                int num = Integer.parseInt(st.nextToken());
                if (j == 0) continue;
                sb.append(j * num + " ");
                
            }
            
            sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
