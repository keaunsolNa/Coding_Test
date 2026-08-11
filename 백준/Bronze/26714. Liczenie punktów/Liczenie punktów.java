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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int cnt = 0;
		
		for(int i = 0; i < T; i += (T / 10)) {
			boolean chk = true;
			for(int j = i; j < i + (T / 10); j++) {
				if(input.charAt(j) != 'T') chk = false;
			}
			
			if(chk) cnt++;
		}
		
		System.out.println(cnt);
	}
}
