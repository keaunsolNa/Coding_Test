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
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));

		
		for(int i = 1; i <= N; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) sb.append("DeadMan" + "\n");
			else if(i % 3 == 0) sb.append("Dead" + "\n");
			else if(i % 5 == 0) sb.append("Man" + "\n");
			else sb.append(i + " ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
