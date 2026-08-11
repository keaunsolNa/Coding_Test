import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
		
			Long N = Long.parseLong(br.readLine());
			Long ans = N;
			Set<Character> set = new HashSet<>();
			
			int idx = 1;
			while(set.size() != 10) {
				
				ans = idx * N;
				String temp = ans + "";
				
				for(int i = 0; i < temp.length(); i++) set.add(temp.charAt(i));
				idx++;
				
				if(idx > 100) break;
				
			}
			
			String answer = (idx > 100) ? "INSOMNIA" : ans + "";
			
			sb.append("Case #" + t + ": " + answer + "\n");
		}
		
		System.out.print(sb);
	}
}
