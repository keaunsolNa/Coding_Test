package baekjoon_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Sort02 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	// 애너그램
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringBuilder sb = new StringBuilder();
			String temp = br.readLine();
			String str1 = temp.split(" ")[0];
			String str2 = temp.split(" ")[1];
			sb.append(str1 + " & " + str2 + " are ");
			if(str1.length() != str2.length()) {
				sb.append("NOT anagrams.");
			} else {
				
				int str1ToInt = 0;
				int str2ToInt = 0;
				for(int j = 0; j < str1.length(); j++) {
					str1ToInt += str1.charAt(j);
					str2ToInt += str2.charAt(j);
				}
				
				if(str1ToInt == str2ToInt) {
					sb.append("anagrams.");
				} else {
					sb.append("NOT anagrams.");
				}
			}
			
			System.out.println(sb);
			
		}
		
	}
	
	
	// K번째 수
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		System.out.println(arr[K-1]);
	}
}
