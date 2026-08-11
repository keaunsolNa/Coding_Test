import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		int idx = 1;
		boolean back = false;
		for(int i = 1; i <= T; i++) {
			String[] input = br.readLine().split(" ");
			String card = input[0];
			int time = Integer.parseInt(input[1]);
			
			sb.append(idx + " ");
			if(card.equals("HOURGLASS")) {
				
				if(time == idx) {
					sb.append("NO");
				} else {
					if(!back) back = true;
					else back = false;
				}
			}
			if(time == idx) {
				if(!card.equals("HOURGLASS"))sb.append("YES");
				
			} else {
				sb.append("NO");
			}
			
			
			if(back) {
				if(idx == 1) idx = 12;
				else idx--;
			}else {
				if(idx == 12) idx = 0;
				idx++;
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
