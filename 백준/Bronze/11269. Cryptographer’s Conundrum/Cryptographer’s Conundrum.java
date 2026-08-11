import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < input.length(); i += 3) {
			
			if(input.charAt(i) != 'P') cnt++;
			if(input.charAt(i + 1) != 'E') cnt++;
			if(input.charAt(i + 2) != 'R') cnt++;
		}
		
		System.out.println(cnt);
	}
}
