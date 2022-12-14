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
		test10();
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
	
    // 핸드폰 번호 궁합
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String two = br.readLine();
		String result = "";
		
		for(int i = 0; i < one.length(); i++) {
			result += one.charAt(i);
			result += two.charAt(i);
		}
		
		while(result.length() != 2) {
			String temp = "";
			for(int i = 0; i < result.length() - 1; i++) {
				String str = (Integer.parseInt(result.charAt(i)+"") + Integer.parseInt(result.charAt(i+1)+"") +"");
				temp += str.charAt(str.length()-1);
			}
			result = temp;
		}
		
		System.out.println(result);
    }

	// 누울 자리를 찾아라
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for(int i = 0; i < n; i++) {
            String[] val = br.readLine().split("");
            for(int j = 0; j < n; j++) {
                arr[i][j] = val[j].charAt(0);
            }
        }
        
        int x = 0, y = 0;
        for(int i = 0; i < n; i++) {
        	
            for (int j = 0 ; j < n; j++) {
            	
                if(i + 1 < n) {
                	
                    if (arr[i][j] == '.' && arr[i+1][j] == '.' && (i + 2 >= n || arr[i+2][j] == 'X')) {
                        y += 1;
                    }
                    
                }
                
                if(j + 1 < n) {
                	
                    if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= n || arr[i][j + 2] == 'X')) {
                        x += 1;
                    }
                    
                }
            }
        }
        System.out.println(x + " " + y);
	}
	
	// 스캐너
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<>();
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[strArr.length];

		for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i]);

		String input = "";

		while ((input = br.readLine()) != null) {
			String book = input;
			if (book == "") break;
			list.add(book);
		}
		
		int x = arr[1] * arr[3] / list.get(0).length();
		int y = arr[0] * arr[2] / list.size();

		for (int i = 0; i < list.size(); i++) { 
			String str = "";
			
			for (int j = 0; j < list.get(0).length(); j++) {
				
				for (int k = 0; k < x; k++)
					str += list.get(i).charAt(j);
			}
			
			for (int k = 0; k < y; k++) {
				System.out.print(str);
				if (k != y || k != 0) 
					System.out.println();
			}
		}
	}
	
	// 나는 친구가 적다 (Small)
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().replaceAll("[0-9]", "");
		String K = br.readLine();
		
		if(input.contains(K)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	

    // 행복한지 슬픈지
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] happy = input.split(":-\\)");
		String[] unHappy = input.split(":-\\(");
		
		if(happy.length == 1 && unHappy.length == 1) {
			System.out.println("none");
		} else if(happy.length > unHappy.length) {
			System.out.println("happy");
		} else if(happy.length < unHappy.length) {
			System.out.println("sad");
		} else if(happy.length == unHappy.length) {
			System.out.println("unsure");
		}
		
	}
	
	
}
