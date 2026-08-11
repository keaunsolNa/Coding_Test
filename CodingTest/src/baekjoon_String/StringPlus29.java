package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringPlus29 {
	
	public static void main(String[] args) throws IOException {
		test01();
	}

	// 17609번 - 회문
	private static String input;
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			input = br.readLine();
			
			int start = 0;
			int end = input.length() - 1;
			int cnt = 0; 
		
			System.out.println(palindrome(start, end, cnt));
			
		}
	
	}
	
	private static int palindrome(int start, int end, int cnt) {
		
		while(start < end) {
			
			
			if(input.charAt(start) == input.charAt(end)) {
				start++;
				end--;
				continue;
			}
			
			if(cnt != 0) 
				return 2;
			
			cnt++; 
			
			int leftOrRight = palindrome(start, end-1, cnt);
			
            if (leftOrRight == 1) {
                end--;
                continue;
            }
            
            leftOrRight = palindrome(start+1, end, cnt);
            
            if (leftOrRight == 1) {
                start++;
                continue;
            }
            
		}
		
		return cnt;
	}
	
	
	// 6581번 - HTML 
	private static StringBuilder sb = new StringBuilder();
	
    
	// 20002번 - 추월 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] in = new String[N];
		for(int i = 0; i < N; i++) in[i] = br.readLine();
		
		String[] out = new String[N];
		for(int i = 0; i < N; i++) out[i] = br.readLine();

		boolean[] chk = new boolean[N];
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(!in[i].equals(out[j])) {
					if(!chk[j]) {
						chk[j] = true;
						cnt++;
					}
				}
				
				else {
					
					chk[j] = true;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
	
	
	// 12904번 - A와 B
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder S = new StringBuilder(br.readLine());
		StringBuilder T = new StringBuilder(br.readLine());
		
		while(S.length() != T.length()) {
			
			if(T.charAt(T.length() - 1) == 'A') {
				T.deleteCharAt(T.length() - 1);
			} else {
				T.deleteCharAt(T.length() - 1);
				T.reverse();
			}
		}
		
		int ans = (S.toString().equals(T.toString())) ? 1 : 0;
		
		System.out.println(ans);
	}
	
	
}
