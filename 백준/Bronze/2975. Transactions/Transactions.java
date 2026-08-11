import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 W 0")) {
			st = new StringTokenizer(input);
			
			int firstMoney = Integer.parseInt(st.nextToken());
			String WD = st.nextToken();
			int money = Integer.parseInt(st.nextToken());
			
			if(WD.equals("D")) {
				if(firstMoney + money >= -200) {
					sb.append(firstMoney + money).append("\n");
				} else {
					sb.append("Not allowed" + "\n");
				}
			} else {
				if(firstMoney - money >= -200) {
					sb.append(firstMoney - money).append("\n");
				} else {
					sb.append("Not allowed" + "\n");
				}
			}
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);

	}
}
