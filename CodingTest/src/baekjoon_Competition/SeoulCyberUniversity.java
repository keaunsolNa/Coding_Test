package baekjoon_Competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SeoulCyberUniversity {
	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}
	
	// A번 - 빅데이터? 정보보호!
	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		input = input.replaceAll("bigdata", "A");
		input = input.replaceAll("security", "B");
		
		int big = 0;
		int sec = 0;
		for(int i = 0; i < N; i++) {
			if(input.charAt(i) == 'A') {
				big++;
			} else {
				sec++;
			}
		}
		
		if(big > sec) {
			System.out.println("bigdata?");
		} else if(big < sec) {
			System.out.println("security!");
		} else {
			System.out.println("bigdata? security!");
		}
	}

	// B번 멘토와 멘티
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		Map<String, List<String>> mentoAndMenti = new TreeMap<>();
		
		for(int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			String mento = input[0];
			String menti = input[1];
			if(mentoAndMenti.containsKey(mento)) {
				
				mentoAndMenti.get(mento).add(menti);
				
			} else {
				
				List<String> mentiList = new ArrayList<>();
				mentiList.add(menti);
				mentoAndMenti.put(mento, mentiList);
				
			}
			
		}
		StringBuilder sb = new StringBuilder();
		for (String mento : mentoAndMenti.keySet()) {
			
			Collections.sort(mentoAndMenti.get(mento), Collections.reverseOrder());
			
			for(int i = 0; i < mentoAndMenti.get(mento).size(); i++) {
				sb.append(mento).append(" ").append(mentoAndMenti.get(mento).get(i)).append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
	
	// C번 - 비즈네르 암호 해독
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pt = br.readLine();
		String biz = br.readLine();
				
		List<Integer> key = new ArrayList<>();
		for(int i = 0; i < pt.length(); i++) {
			int plT = pt.charAt(i)- 'A' + 1;
			int biT = biz.charAt(i) - 'A' + 1;
			if(biT - plT <= 0) {
				key.add(biT - plT + 26);
			} else {
				key.add(biT - plT);
			}
		}
		
		StringBuilder sb= new StringBuilder();
		int first = key.get(0);
		if(key.size() == 0) sb.append(key.get(0));
		for(int i = 1; i < key.size(); i++) {
			
			
			if(first == key.get(i)) {
				if(pt.length() % i == 0) {
					for(int j = 0; j < i; j++) {
						int temp = key.get(j);
						sb.append((char)(temp + 'A' - 1));
					}
					break;
				}
					
			}
			if(i == key.size()-1) {
				for(int j = 0; j <= i; j++) {
					int temp = key.get(j);
					sb.append((char)(temp + 'A' - 1));
				}
			}
		}
		System.out.print(sb);
	}
}