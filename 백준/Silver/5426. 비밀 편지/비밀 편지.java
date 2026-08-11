import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			int length = input.length();
			length = (int)Math.sqrt(length);
			char[][] map = new char[length][length];

			int idx = 0;
			for(int j = 0; j < length; j++) {
				
				for(int k = 0; k < length; k++) {
					map[j][k] = input.charAt(idx);
					idx++;
				}
			}
			
			char[][] ans = new char[length][length];
			
			for(int j = 0; j < length; j++) {
				
				for(int k = 0; k < length; k++) {
					
					ans[j][k] = map[k][length - j - 1];
				}
			}
			
			for (char[] cs : ans) {
				for (char cs2 : cs) {
					sb.append(cs2);
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
