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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		int n = 1;
		if(str.length() < 4) {
			
			char c = str.charAt(0);
			while(n < str.length())
				if(str.charAt(n) != c) break;
				else n++;
			
		}
		
		if(n == str.length()) sb.append(str + " " + str);
		
		else {
			
			for(int i = 1; i <= 999; i++) {
				
				if(str.startsWith(Integer.toString(i))) {
					String s = str;
					
					for(int j = i; j <= 999; j++) {
						
						if(s.startsWith(Integer.toString(j))) s = s.substring(Integer.toString(j).length());
						else break;

						if(s.length() == 0) {
							sb.append(i + " " + j);
							break;
						}
						
					}
					
					if(sb.length() != 0) break;
				}
			}
		}
		
		System.out.print(sb);
		
	}
}
