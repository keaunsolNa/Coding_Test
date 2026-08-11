package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StringPlus14 {
	
	public static void main(String[] args) throws IOException {
		test05();
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
	
	
}
