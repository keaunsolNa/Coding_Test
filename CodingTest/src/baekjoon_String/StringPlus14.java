package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringPlus14 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Death Knight Hero 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i = 0; i < T; i++) {
			String skill = br.readLine();
			boolean flag = true;
			for(int j = 0; j < skill.length(); j++) {
				
				if(j != skill.length()-1) {
					if(skill.charAt(j) == 'C' && skill.charAt(j+1) == 'D') flag = false;
				}
			}
			
			if(flag) cnt++;
		}
		
		System.out.println(cnt);
	}
	
	// Chronogram 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Map<String, Integer> chronogram = new HashMap<>();
		
		chronogram.put("I", 1);
		chronogram.put("V", 5);
		chronogram.put("X", 10);
		chronogram.put("L", 50);
		chronogram.put("C", 100);
		chronogram.put("D", 500);
		chronogram.put("M", 1000);
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			
			int year = 0;
			for(int j = 0; j < input.length(); j++) {
				if(chronogram.containsKey(input.charAt(j)+"")) year += chronogram.get(input.charAt(j)+"");
					
			}
			System.out.println(year);
		}
	}

	// Coffee Cup Combo 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int total = 0;
		int have = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '1') {
				total++;
				have = 2;
			} else {
				if(have > 0) {
					total++;
					have--;
				}
			}
			
		}
		
		System.out.println(total);
	}
	
	// 次の文字 (Next Character)
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		for(int i = 0; i < N; i++) {
			if(i != N-1) {
				if(input.charAt(i+1) == 'J') {
					System.out.println(input.charAt(i));
				}
			}
		}
	}
	
	// Pirates 
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		long cnt = 0;
		long max = 0;
		char target = ' ';
		for(int i = 0; i < T; i++) {
				
			cnt = countChar(input, input.charAt(i));
			
			if(cnt > max) {
				max = cnt;
				target = input.charAt(i);
			}
		}
		System.out.println(target + " " + max);
	}
	
    public static long countChar(String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    // 균형 잡힌 소떡소떡
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T  = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		while(true) {
			if(countChar(input, 's') == countChar(input, 't')) {
				System.out.println(input);
				break;
			} else { 
				input = input.substring(1);
			}
		}
		
		
    }

	// HI-ARC
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String S = br.readLine();
		
		long h = countChar(S, 'H');
		long i = countChar(S, 'I');
		long a = countChar(S, 'A');
		long r = countChar(S, 'R');
		long c = countChar(S, 'C');
		
		System.out.println(Math.min(Math.min(Math.min(Math.min(h, i), a), r), c));
	}
	
	// 좋은 자동차 번호판 
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			String front = temp.split("-")[0];
			int back = Integer.parseInt(temp.split("-")[1]);

			int frontNumber = 0;
			for(int j = 0; j < front.length(); j++) {
				int number = front.charAt(j) - 'A';
				number *= Math.pow(26,  2- j);
				frontNumber += number;
			}
			
			if(Math.abs(frontNumber - back) <= 100) {
				System.out.println("nice");
			} else {
				System.out.println("not nice");
			}
		}
	}
	
	// 팰린드롬 
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		boolean flag = true;
		for(int i = 0; i < input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length() - (i+1))) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	// SMUPC의 등장
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			String number = (int)input.charAt(i) +"";
			
			int round = 0;
			for(int j = 0; j < number.length(); j++) {
				round += Character.getNumericValue(number.charAt(j));
			}
			
			for(int j = 0; j < round; j++) {
				System.out.print(input.charAt(i));
			}
			if(i != input.length() - 1) {
				System.out.println();
			}
		}
	}
	
}
