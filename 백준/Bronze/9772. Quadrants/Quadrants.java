import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			

			String ans = "";
			if(x == 0 && y == 0) {
				ans = "AXIS";
				sb.append(ans);
				break;
			}
			
			if(x == 0 || y == 0) ans = "AXIS";
			else if(x < 0 && y < 0) ans = "Q3";
			else if(x < 0 && y > 0) ans = "Q2";
			else if(x > 0 && y > 0) ans = "Q1";
			else if(x > 0 && y < 0) ans = "Q4";
			
			sb.append(ans + "\n");
		}
	
		System.out.print(sb);
		
	}
}
