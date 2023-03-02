package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringPlus32 {
	
	public static void main(String[] args) throws IOException {
		test08();
	}

	// 27522번 - 카트라이더: 드리프트
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<Integer, String> map = new TreeMap<>();
		for(int i = 0; i < 8; i++) {
			st = new StringTokenizer(br.readLine());
			int[] inputs = Arrays.stream(st.nextToken().split(":")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			int time = (inputs[0] * 60000) + (inputs[1] * 1000) + inputs[2];
			String team = st.nextToken();
			
			map.put(time, team);
		}
		
		int point = 10;
		int red = 0;
		int blue = 0;
		for (int key : map.keySet()) {
			
			if(map.get(key).equals("B")) blue += point;
			else red += point;
			
			if(point > 6) point -= 2;
			else point--;
			
		}
		
		if(red > blue) System.out.println("Red");
		else System.out.println("Blue");
	}
	
	// 5582번 - 공통 부분 문자열
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String A = br.readLine();
		String B = br.readLine();
		int[][] dp = new int[A.length() + 1][B.length() + 1];

		int max = 0;

		for(int i = 1; i <= A.length(); i++) {
			
			for(int j = 1; j <= B.length(); j++) {
				if(A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
			}
		}
		
		System.out.println(max);
	}
	
	// 27494번 - 2023년은 검은 토끼의 해
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.length() >= 4 && make(s)) cnt++;
        }
        System.out.println(cnt);
	}
	
	private static boolean make(String s) {
    
		ArrayList<Integer> digits = new ArrayList<Integer>();
        for (char c : s.toCharArray())
            if (Character.isDigit(c)) 
                digits.add(c - '0');
        
        if (digits.size() < 4) 
            return false;
        
        int n = digits.size();
        
        for (int i = 0; i < n - 3; i++) 
            if (digits.get(i) == 2) 
                for (int j = i + 1; j < n - 2; j++) 
                    if (digits.get(j) == 0) 
                        for (int k = j + 1; k < n - 1; k++) 
                            if (digits.get(k) == 2)
                                for (int l = k + 1; l < n; l++) 
                                    if (digits.get(l) == 3) 
                                        return true;
        return false;
    }

	// 2607번 - 비슷한 단어
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String base = br.readLine();
		int[] baseArr = new int[26];
		
		for(int i = 0; i < base.length(); i++) baseArr[base.charAt(i) - 'A']++;
		
		int ans = 0;
		for(int i = 0; i < T - 1; i++) {
			
			String temp = br.readLine();
			if(Math.abs(temp.length() - base.length()) > 1) continue;

			int dif = 0;
			int[] tempArr = baseArr.clone();
			
			for(int j = 0; j < temp.length(); j++) {
				int idx = temp.charAt(j) - 'A';
				
				if(tempArr[idx] > 0) {
					dif++;
					tempArr[idx]--;
				}
			}
			
            if(base.length() - 1 == temp.length()) {
            	
                if(dif == temp.length()) ans++;
                
            }

            else if(base.length() + 1 == temp.length()) {
            	
                if(dif == base.length()) ans++;
                
            }

            else if(base.length() == temp.length()) {
            	
                if(dif == base.length()) ans++;
                else if(dif == base.length() - 1) ans++;
                
            }
            
		}
		
		System.out.println(ans);
	}
	
	// 15353번 - 큰 수 A+B (2) 
	public static void test05() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));
	}
	
	// 2852번 - NBA 농구
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t;
		int ntime;
		int time = 0;
		int t_a = 0;
		int t_b = 0;
		int s = 0;
		boolean chk;
		t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			st = new StringTokenizer(br.readLine());
			chk = st.nextToken().equals("1") ? true : false;
			String str = st.nextToken();
			
			ntime = (str.charAt(0) - '0') * 600;
			ntime += (str.charAt(1) - '0') * 60;
			ntime += (str.charAt(3) - '0') * 10;
			ntime += str.charAt(4) - '0';
			
			if(s > 0) t_a += ntime - time;
			if(s < 0) t_b += ntime - time;
			s += chk ? 1 : -1;
			time = ntime;
			
		}
		
		if(s > 0) t_a += 2880 - time;
		if(s < 0) t_b += 2880 - time;
		System.out.printf("%02d:%02d\n%02d:%02d\n", t_a / 60, t_a % 60, t_b / 60, t_b % 60);
		
	}
	
	// 27627번 - Splitology
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		for(int i = 1; i < input.length(); i++) {
			
			if(isPalindrome(input.substring(0, i)) && isPalindrome(input.substring(i, input.length()))) {
				System.out.println(input.substring(0, i) + " " + input.substring(i, input.length()));
				return;
			}
		}
		
		System.out.println("NO");
	}
	
    private static boolean isPalindrome(String word) {
        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
	// 1718번 - 암호
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] plainText = br.readLine().toCharArray();
		char[] key = br.readLine().toCharArray();

		for(int i = 0; i < plainText.length; i++) {
			
			if(plainText[i] == ' ') {
				sb.append(" ");
				continue;
			}
			int move = key[i % key.length] - 'a' + 1;
			int plain = plainText[i];

			if(plain - move < 97) {
				sb.append((char)(plain - move + 26));
			} else sb.append((char)(plain - move));
		}
		
		System.out.println(sb);
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	
}
