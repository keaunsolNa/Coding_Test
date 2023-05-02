package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringPlus34 {
	
	public static void main(String[] args) throws IOException {
		test05();
	}

	// 5365번 - Decoder
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		int len = input[0].length();
		sb.append(input[0].charAt(0));
		
		for(int i = 1; i < N; i++) {
			
			if(input[i].length() >= len) sb.append(input[i].charAt(len - 1));
			else sb.append(" ");
			
			len = input[i].length();
		}
		
		System.out.print(sb);
	}
	
	// 25183번 - 인생은 한 방
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = input.charAt(i);

		int cnt = 0;
		for(int i = 0; i < N - 1; i++) {
			
			if(Math.abs(arr[i] - arr[i + 1]) == 1) cnt++;
			else cnt = 0;
			
			if(cnt == 4) break;
		}
		
		System.out.println(cnt == 4 ? "YES" : "NO");
	}
	
	// 2608번 - 로마 숫자
	private static int sum;
	private static String input;
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		sum = 0;

		input = br.readLine();
		remove();
		sum += makeInt(input);
		
		input = br.readLine();
		remove();
		sum += makeInt(input);
		
		System.out.println(sum);
		
		StringBuilder ans = new StringBuilder();
		
		while(sum >= 1000) {
			sum -= 1000;
			ans.append("M");
		}
		
		if(sum >= 900) {
			ans.append("CM");
			sum -= 900;
		}

		if(sum >= 500) {
			ans.append("D");
			sum -= 500;
		}

		if(sum >= 400) {
			ans.append("CD");
			sum -= 400;
		}
		
		
		while(sum >= 100) {
			ans.append("C");
			sum -= 100;
		}

		if(sum >= 90) {
			ans.append("XC");
			sum -= 90;
		}

		if(sum >= 50) {
			ans.append("L");
			sum -= 50;
		}

		if(sum >= 40) {
			ans.append("XL");
			sum -= 40;
		}
		
		while(sum >= 10) {
			ans.append("X");
			sum -= 10;
		}

		if(sum >= 9) {
			ans.append("IX");
			sum -= 9;
		}

		if(sum >= 5) {
			ans.append("V");
			sum -= 5;
		}
		
		if(sum >= 4) {
			ans.append("IV");
			sum -= 4;
		}
		
		while(sum >= 1) {
			ans.append("I");
			sum -= 1;
		}
		
		System.out.println(ans);
	}

	private static void remove() {
		
		input = input.replaceAll("IV", "A");
		input = input.replaceAll("IX", "B");
		input = input.replaceAll("XL", "E");
		input = input.replaceAll("XC", "F");
		input = input.replaceAll("CD", "G");
		input = input.replaceAll("CM", "H");
		
	}
	
	private static int makeInt(String input) {
		
		int num = 0;
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'I') num += 1;
			else if(input.charAt(i) == 'V') num += 5;
			else if(input.charAt(i) == 'X') num += 10;
			else if(input.charAt(i) == 'L') num += 50;
			else if(input.charAt(i) == 'C') num += 100;
			else if(input.charAt(i) == 'D') num += 500;
			else if(input.charAt(i) == 'M') num += 1000;
			else if(input.charAt(i) == 'A') num += 4;
			else if(input.charAt(i) == 'B') num += 9;
			else if(input.charAt(i) == 'E') num += 40;
			else if(input.charAt(i) == 'F') num += 90;
			else if(input.charAt(i) == 'G') num += 400;
			else if(input.charAt(i) == 'H') num += 900;
		}
		
		return num;
	}
	
	// 16500번 - 문자열 판별
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());

		Set<String> set = new HashSet<>();
		int[] dp = new int[101];
		for(int i = 0; i < N; i++) set.add(br.readLine());
		
		for(int i = str.length() - 1; i >= 0; i--) {
			
			for(int j = i + 1; j < str.length(); j++) {
				
				if(dp[j] == 1) if(set.contains(str.substring(i, j))) dp[i] = 1;
			}
			
			if(set.contains(str.substring(i))) dp[i] = 1;
		}
		
		System.out.println(dp[0]);
	}
	
	// 14369번 - 전화번호 수수께끼 (Small) 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
        	
            String s = br.readLine();
            int n = s.length();
            int[] cnt = new int[256];

            for (int i = 0; i < n; i++) cnt[s.charAt(i)]++;
            

            int[] out = new int[10];
            int[] sz = {4, 3, 3, 5, 4, 4, 3, 5, 5, 4};
            String[] sp = {"Z-W-U-X-G-", "-O-H-F-S-I"};
            String[] num = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 10; j++) {
                    if (cnt[sp[i].charAt(j)] > 0) {
                        int c = out[j] = cnt[sp[i].charAt(j)];
                        for (int k = 0; k < sz[j]; k++) {
                            cnt[num[j].charAt(k)] -= c;
                        }
                    }
                }
            }

            System.out.print("Case #" + test + ": ");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < out[i]; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
	
	// 14370번 - 전화번호 수수께끼 (Large) 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
        	
            String s = br.readLine();
            int n = s.length();
            int[] cnt = new int[256];

            for (int i = 0; i < n; i++) cnt[s.charAt(i)]++;
            

            int[] out = new int[10];
            int[] sz = {4, 3, 3, 5, 4, 4, 3, 5, 5, 4};
            String[] sp = {"Z-W-U-X-G-", "-O-H-F-S-I"};
            String[] num = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 10; j++) {
                    if (cnt[sp[i].charAt(j)] > 0) {
                        int c = out[j] = cnt[sp[i].charAt(j)];
                        for (int k = 0; k < sz[j]; k++) {
                            cnt[num[j].charAt(k)] -= c;
                        }
                    }
                }
            }

            System.out.print("Case #" + test + ": ");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < out[i]; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
	}
	
	// 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
	}
}
