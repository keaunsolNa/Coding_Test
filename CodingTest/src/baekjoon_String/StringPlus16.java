package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringPlus16 {
	
	public static void main(String[] args) throws IOException {
		test05();
	}

	// 복호화
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String input = br.readLine().replaceAll(" ", "");
			Map<Character, Integer> map = new TreeMap<>(); 
			
			for(int j = 0; j < input.length(); j++) {
				char key = input.charAt(j);
				map.put(key, map.getOrDefault(key, 0) + 1);
			}
			
			int max = 0;
			char answer = ' ';
			boolean flag = true;
			for (Character key : map.keySet()) {
				if(map.get(key) > max) {
					max = map.get(key);
					answer = key;
					flag = true;
				} else if(map.get(key) == max) {
					flag = false;
				}
			}
			
			if(flag) {
				sb.append(answer).append("\n");
			} else {
				sb.append("?").append("\n");
			}
		}
		
		System.out.print(sb.deleteCharAt(sb.length() - 1));
	}
	
	// 비슷한 전화번호 표시
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArr = br.readLine().split(" ");
		String phone = br.readLine();
		String temp = "";
		
		int match = 0;
		for(int i = 0; i < inputArr.length; i++) {
			if(!inputArr[i].equals(phone)) {
				
				for(int j = 0; j < inputArr[i].length(); j++) {
					
					if(inputArr[i].substring(0, j+1).equals(phone)) {
						match++;
						break;
					}
				}
			}
		}
		
		System.out.println(match);
	}

	// 더하기2
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		StringBuilder sb = new StringBuilder();
		
		while((input = br.readLine()) != null) {
			sb.append(input);
		}
		String[] arr = sb.toString().split(",");
		
		BigInteger total = new BigInteger("0");
		for(int i = 0; i < arr.length; i++) {
			BigInteger number = new BigInteger(arr[i]);
			total = total.add(number);
		}
		
		System.out.println(total);
	}
	
	// 히든 넘버
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int n = Integer.parseInt(br.readLine());
		String word = br.readLine();
		char ch;
		long number = 0L;
		long result = 0;
		for(int i = 0 ; i < n ; i++) {
			ch = word.charAt(i);			
			if(ch >= 65 && ch <= 122) {
					result += (number);
					number = 0L;
			} else {
				number = 10*number + (ch - '0');
			}
		}
		if(number !=0) result += number;
		System.out.println(result);
	}
	
	// 뚊
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String A = "";
		String B = "";

		for(int i = 0; i < N; i++) {
			A += br.readLine();
		}
		for(int i = 0; i < N; i++) {
			B += br.readLine();
		}
		
		A = A + A;
		
		List<String> AList = new ArrayList<>();
		for(int i = 0; i < A.length(); i++) {
			AList.add(A.charAt(i)+"");
		}
		
		List<String> BList = new ArrayList<>();
		for(int i = 0; i < B.length(); i++) {
			BList.add(B.charAt(i)+"");
		}
		
		Collections.sort(AList);
		Collections.sort(BList);
		
		if(AList.containsAll(BList)) {
			System.out.println("Eyfa");
		} else {
			System.out.println("Not Eyfa");
		}
	}
	
    // 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
    }

	// 
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
	}
	
	//
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
	}
	
	// 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
	}
	

    // 
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	
}
