import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hey = br.readLine();
		
		int eLength = hey.substring(1, hey.length()-1).length();

		StringBuilder sb = new StringBuilder();
		sb.append("h");
		for(int i = 0; i < eLength; i++) {
			sb.append("e");
			sb.append("e");
		}
		sb.append("y");
		
		System.out.println(sb);
	}
}
