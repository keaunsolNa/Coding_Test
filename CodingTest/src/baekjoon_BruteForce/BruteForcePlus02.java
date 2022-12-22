package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BruteForcePlus02 {
	
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 단순한 문제 (Small)
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for(int x = 1; x <= a; x++) {
				for(int y = 1; y <= b; y++) {
					for(int z = 1; z <= c; z++) {
						if(x%y == y%z && y%z == z%x) {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}

	// 지각
	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int time = Integer.parseInt(br.readLine());
			int max = 1;
			
			while(max + (max * max) <= time) max++;
			
			System.out.println((max - 1));
		}
		
	}
	
	// 수학적 호기심
	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int answer = 0;
			for(int b = 1; b < n; b++) {
				
				for(int a = 1; a < b; a++) {
					double target = (double)((a*a) + (b*b) + m)/(a*b);
					if(target == (int)target) answer++;
				}
			}
			System.out.println(answer);
		}
	}
	
	// Four Squares
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		dp[1] = 1;
		
		int min = 0;
		for(int i = 2; i <= N; i++) {
			min = Integer.MAX_VALUE;
			
			for(int j = 1; j * j <= i; j++) {
                int temp = i - j * j;
                min = Math.min(min, dp[temp]);
			}
			
			dp[i] = min + 1;
		}
		
		System.out.println(dp[N]);
		
	}

	// 2018 연세대학교 프로그래밍 경진대회
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1;
	
		int answer = 0;
		for(int i = 1; i < N; i++) {
			
			if(i*i + i == N) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}

	// 2017 연세대학교 프로그래밍 경시대회
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int A = 2; A < N; A+=2) {
			
			for(int B = 1; B < N-A; B++) {
				
				for(int C = B+2; C < N; C++) {
					if(A+B+C == N) {
						cnt++;
					}
				}
			}
			
		}
		System.out.println(cnt);
	}
	
	// 팰린드롬
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			String[] word = new String[K];

			for(int j = 0; j < K; j++) {
				word[j] = br.readLine();
			}
			
			boolean chk = false;
			String palindrome = "";
			for(int j = 0; j < K; j++) {
				
				for(int k = 0; k < K; k++) {
					
					if(j == k)continue;
					String temp = word[j] + word[k];
					
					if(isPalindrome(temp)) {
						chk = true;
						palindrome = temp;
						break;
					}
				}
			if(chk)break;
			
			
			}
			if(chk) {
				System.out.println(palindrome);
			} else {
				System.out.println(0);
			}
		}
	}
	
    static boolean isPalindrome(String word) {
        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
	
    // 호텔 방 번호
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while((input = br.readLine()) != null) {
			int N = Integer.parseInt(input.split(" ")[0]);
			int M = Integer.parseInt(input.split(" ")[1]);
			
			int possible = 0;
			for(int i = N; i <= M; i++) {
				if(dupCheck(i+"")) {
					possible++;
				}
				
			}
			
			System.out.println(possible);
		}
		
	}
	
	static boolean dupCheck(String word) {
		Set<Character> set = new HashSet<>();
		
		for(int i = 0; i < word.length(); i++) set.add(word.charAt(i));
		
		if(word.length() != set.size()) {
			return false;
		} else {
			return true;
		}
	}
	
	// 숫자 빈도수
	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int cnt = 0;
        for (int i = 1; i <= n; i++) {
            cnt += count(i, d);
        }
	
        System.out.println(cnt);
	}
	
	static int count(int num, int d) {
        int cnt = 0;
        
        while (num != 0) {
            if (num%10 == d)
                cnt++;
            num /= 10;
        }
        return cnt;
	}
	
	// 인공 원소
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int a = Integer.parseInt(br.readLine());
			if(check(a)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
	
	static boolean check(int a) {
		
		List<Integer> primeList = new ArrayList<>();
		for(int i = 1; i <= a; i++) {
			if(isPrime(i)) {
				primeList.add(i);
			}
		}
		
		for(int i = 0; i < primeList.size(); i++) {
			
			for(int j = 0; j < primeList.size(); j++) {
				
				if(primeList.get(i) + primeList.get(j) == a) {
					return true;
				}
			}
		}
		return false;
	}
    public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
}

