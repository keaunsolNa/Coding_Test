import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			
			for(int j = 2; j < temp.length; j++) {
				sb.append(temp[j] + " ");
			}
			sb.append(temp[0] + " " + temp[1]);
			System.out.println(sb);
			sb.setLength(0);
		}
	}
}
