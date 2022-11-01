package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringPlus12 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 파일 완전 삭제
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		String input2 = br.readLine();
		
		if(N%2 == 0) {
			
			if(input.equals(input2)) {
				System.out.println("Deletion succeeded");
			} else {
				System.out.println("Deletion failed");
			}
			
		} else {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < input2.length(); i++) {
				if(input2.charAt(i) == '0') {
					sb.append('1');
				} else {
					sb.append('0');
				}
			}
			
			if(sb.toString().equals(input)) {
				System.out.println("Deletion succeeded");
			} else {
				System.out.println("Deletion failed");
			}
		}
		
	}
	
	// 원피스
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String key = br.readLine();
		input = input.replaceAll(key, "a");
		
		System.out.println(input.length() - input.replaceAll("a", "").length());
	
	}

	// 패리티
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).contains("#")) {
			if(input.charAt(input.length() - 1) == 'e') {
				if((input.length() - input.replaceAll("1", "").length()) % 2 == 0) {
					System.out.println(input.replace('e', '0'));
				} else {
					System.out.println(input.replace('e', '1'));
				}
			} else {
				if((input.length() - input.replaceAll("1", "").length()) % 2 == 0) {
					System.out.println(input.replace('o', '1'));
				} else {
					System.out.println(input.replace('o', '0'));
				}
			}
		}
	}
	
	// 2진수 뒤집기
	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder NBinary = new StringBuilder(Integer.toBinaryString(Integer.parseInt(br.readLine())));
		NBinary.reverse();
		System.out.println(Integer.parseInt(NBinary.toString(), 2));
	}
	
	// 꿍 가라사대
	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			
			if(temp[0].equals("Simon") && temp[1].equals("says")) {
				StringBuilder sb =  new StringBuilder();
				for(int j = 2; j < temp.length; j++) {
					sb.append(" " + temp[j]);
				}
				
				System.out.println(sb);
			}
		}
	}
	
	// 커맨드 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String command = br.readLine();
			
			String A = command.charAt(0)+"";
			String B = "";
			for(int j = 1; j < command.length(); j++) {
				if(!((command.charAt(j)+"").equals(A))) {
					B = command.charAt(j)+"";
					command = command.replaceAll(A, "a");
					command = command.replaceAll(B, "b");
					break;
				}
			}
			
			if(command.equals("aabbabb")) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
    }

	// 모르고리즘 회장님 추천 받습니다
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int maxScore = 0;
		String maxName = "";
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			
			if(score > maxScore) {
				maxScore = score;
				maxName = name;
			} else if(score == maxScore) {
				String[] temp = {maxName, name};
				Arrays.sort(temp);
				maxName = temp[0];
			}
			
		}
		
		System.out.println(maxName);
		
	}
	
	// 초성 중성 종성
	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
		String[] second = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
		String[] third = {"", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ" };
		String input = br.readLine();
		int flag = (int)input.charAt(0) - 44032;
		System.out.println(first[flag/21/28]);
		System.out.println(second[flag%(21*28)/28]);
		System.out.println(third[flag%28]);
	}
	
	// 초성 변환
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
		String input = br.readLine();
		for(int i = 0; i < input.length(); i ++) {
			int flag = (int)input.charAt(i) - 44032;
			System.out.print(first[flag/21/28]);
		}
	}
	
	// 태보태보 총난타
	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("0");

        long lhs = input[0].chars().filter(n -> n == '@').count();
        long rhs = input[1].chars().filter(n -> n == '@').count();

        System.out.print(lhs + " " + rhs);
		
	}
	
}
