import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] isUse = new boolean[26];
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			String str = br.readLine();
			boolean flag = true;
			boolean use = false;
			for(int i = 0; i < str.length(); i++) {
				
				if(i == 0 || str.charAt(i - 1) == 32) {
					
					int temp = str.charAt(i);
					if(temp >= 97) temp -= 32;
					
					if(!isUse[temp - 'A']) {
						
						isUse[temp - 'A'] = true;
						flag = false;
						use = true;
						
						for(int j = 0; j < str.length(); j++) {
							if(j != i) sb.append(str.charAt(j));
							else sb.append("["+str.charAt(j)+"]");
						}
						
						break;
						
					}
				}
			}
			
			if(flag) {
				
				for(int i = 0; i < str.length(); i++) {
					
					if(str.charAt(i) == 32) continue;
					int temp = str.charAt(i);
					if(temp >= 97) temp -= 32;
					
					if(!isUse[temp - 'A']) {
						
						isUse[temp - 'A'] = true;
						flag = false;
						use = true;
						
						for(int j = 0; j < str.length(); j++) {
							if(j != i) sb.append(str.charAt(j));
							else sb.append("["+str.charAt(j)+"]");
						}
						break;
						
					}
				}
			}
			
			if(!use) sb.append(str);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
