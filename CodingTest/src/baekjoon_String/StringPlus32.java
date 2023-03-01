package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class StringPlus32 {
	
	public static void main(String[] args) throws IOException {
		test03();
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

	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
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
