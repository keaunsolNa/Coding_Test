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
	

	// 듣보잡
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> hashMap = new HashMap<>();
		List<String> arrList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			hashMap.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < M; i++) {
			String temp = br.readLine();
			hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
			if(hashMap.get(temp) == 2) arrList.add(temp);
		}
		
		Collections.sort(arrList);
		sb.append(arrList.size() + "\n");
		for (String string : arrList) {
			sb.append(string + "\n");
		}
		
		System.out.println(sb);
	}

	// 접미사 배열
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder S = new StringBuilder( br.readLine());
		List<String> SList = new ArrayList<>();

		while(S.length() != 0) {
			SList.add(S.toString());
			S.deleteCharAt(0);
		}

		Collections.sort(SList);
		for (String string : SList) {
			System.out.println(string);
		}
	}
	
}
