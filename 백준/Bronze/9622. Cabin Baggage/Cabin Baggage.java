import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		int ans = 0;
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			double t1 = Double.parseDouble(st.nextToken());
			double t2 = Double.parseDouble(st.nextToken());
			double t3 = Double.parseDouble(st.nextToken());
			double t4 = Double.parseDouble(st.nextToken());
			
			double sum = t1 + t2 + t3;
			
			boolean chk = false;
			if((t1 <= 56 && t2 <= 45 && t3 <= 25) || sum <= 125) chk = true; 
			
			if(t4 > 7) chk = false;
				
			if(chk) {
				ans++;
				sb.append(1);
			} else sb.append(0);
			
			sb.append("\n");
		}
		
		System.out.print(sb);
		System.out.println(ans);
	}
}
