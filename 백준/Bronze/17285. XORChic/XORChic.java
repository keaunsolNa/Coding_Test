import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String T = br.readLine();
		
		int ans = 0;
		char temp = T.charAt(0);
		
		while((char)((int)temp ^ ans) != 'C') ans++;
		
		for(int i = 0; i < T.length(); i++) sb.append((char)((int)T.charAt(i) ^ ans));
		
		System.out.println(sb);
	}
}
