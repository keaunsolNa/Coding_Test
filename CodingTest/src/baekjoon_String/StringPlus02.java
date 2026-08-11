package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus02 {


	// ROT13
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < S.length; j++) {
		
			String temp = S[j];
			for(int i = 0; i < temp.length(); i++) {
				if(temp.charAt(i) >= 65 && temp.charAt(i) <= 90) {
					if(!(temp.charAt(i) + 13 > 90)) {
						sb.append((char)(temp.charAt(i) + 13));
					} else {
						sb.append((char)((temp.charAt(i) + 13) - 26));
					}
				} else if(temp.charAt(i) >= 97 && temp.charAt(i) <= 122) {
					if(!(temp.charAt(i) + 13 > 122)) {
						sb.append((char)(temp.charAt(i) + 13));
					} else {
						sb.append((char)((temp.charAt(i) + 13) - 26));
					}
				} else {
					sb.append((char)temp.charAt(i));
				}
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
	

}
