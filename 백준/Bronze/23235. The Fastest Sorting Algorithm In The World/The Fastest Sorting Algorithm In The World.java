import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 1;

		while(true) {
			String s = br.readLine();
			if(s.equals("0")) {
				break;
			} 
			sb.append("Case ").append(cnt).append(": Sorting... done!").append("\n");
			cnt++;
		}
		
		System.out.println(sb);
	}
}
