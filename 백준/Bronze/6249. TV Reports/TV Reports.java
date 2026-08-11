import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		while(n --> 0) {
			int input = Integer.parseInt(br.readLine());
			
			if(input > h) {
				sb.append("BBTV: Dollar reached " + input + " Oshloobs, A record!" + "\n");
				h = input;
				p = input;
			}
			
			if(input < p) {
				sb.append("NTV: Dollar dropped by " + (p - input) + " Oshloobs" + "\n");
				p = input;
			}
			
			else p = input;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
