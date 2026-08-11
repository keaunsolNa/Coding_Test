package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus03 {
	

	// 문자열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String temp = br.readLine();
			System.out.println(temp.charAt(0)+""+temp.charAt(temp.length()-1));
		}
	}

	
	// Zadanie próbne
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer W = new StringBuffer(br.readLine());
		System.out.println(W.reverse());
	}
	

	// 모음의 개수
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		String[] vowel = {"a", "e", "i", "o", "u"};
		while(!(temp = br.readLine()).equals("#")) {
			int answer = 0;
			for(int i = 0; i < temp.length(); i++) {
				if(Arrays.asList(vowel).contains(temp.toLowerCase().charAt(i)+"")) {
					answer++;
				}
			}
			System.out.println(answer);
		}
	}
	
	
}
