import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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

		int idx = 1;
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int computer = Integer.parseInt(st.nextToken());
			int cable = Integer.parseInt(st.nextToken());
			
			int need = computer - 1;
			
			sb.append("Case " + idx + ": " + (cable - need) + " \n");
			idx++;
		}
		
		System.out.println(sb);
		
	}
}
