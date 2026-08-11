import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		final double golden1 = 1.60803399;
		final double golden2 = 1.62803399;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			
			double C = Double.parseDouble(String.format("%.8f", A/B));

			if(C >= golden1 && C <= golden2) sb.append("golden");
			else sb.append("not");
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
