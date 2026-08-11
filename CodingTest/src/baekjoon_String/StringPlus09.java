package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringPlus09 {
	
	public static void main(String[] args) throws IOException {
		test05();
	}
	

	// 농구 경기
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < testCase; i++) {
			String temp = br.readLine();
			hashMap.put(temp.charAt(0)+"", hashMap.getOrDefault(temp.charAt(0)+"", 0) + 1);
		}

		Iterator<String> iter = hashMap.keySet().iterator();
		
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()) {
			String temp = iter.next();
			if(hashMap.get(temp) >= 5) {
				sb.append(temp);
			}
		}
		
		if(sb.length() == 0) {
			System.out.println("PREDAJA");
		} else {
			System.out.println(sb);
		}
	}
	

}
