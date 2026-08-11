import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			st = new StringTokenizer(input);
			
			String heisei = st.nextToken();
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			
			if(year == 31) {
				if(month >= 5) {
					heisei = "?";
					year -= 30;
				}
			} else if(year > 31) {
				heisei = "?";
				year -= 30;
			}
			
			sb.append(heisei + " " + year + " " + month + " " + day + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
