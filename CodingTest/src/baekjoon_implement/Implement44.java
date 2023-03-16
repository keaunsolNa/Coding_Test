package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement44 {

	public static void main(String[] args) throws IOException {
		test06();
	}
	
	// 27251번 - Звездочки
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
				if(i > 10) {
					for(int k = 0; k < 100; k++) sb.append("*");
					sb.append("...");
				} else {
					for(int j = 0; j < i * i; j++) sb.append("*");
				}
			sb.append("\n");
		}

		System.out.println(sb);
	}
	
	// 26432번 - Walktober
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sb.append("Case #" + (i + 1) + ": ");
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[M][N];
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			long total = 0;
			for(int j = 0; j < N; j++) {
				int max = 0;
				
				for(int k = 0; k < M; k++) {
					if(k == P - 1) continue;
					
					max = Math.max(arr[k][j], max);
				}
				
				if(max > arr[P - 1][j]) total += max - arr[P - 1][j];
			}
			
			sb.append(total + "\n");
		}
		
		System.out.print(sb);
		
	}
	
	// 17389번 - 보너스 점수
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int totalP = 0;
		int bonus = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == 'O') {
				totalP += (i + 1);
				totalP += bonus;
				bonus++;
			} else bonus = 0;
			
		}
		
		System.out.println(totalP);
	}
	
	// 16674번 - 2018년을 되돌아보며
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.replaceAll("2|0|1|8", "").length() != 0) {
			System.out.println(0);
		} else {
			
			long A = countChar(input, '2');
			long B = countChar(input, '0');
			long C = countChar(input, '1');
			long D = countChar(input, '8');
			
			if(A == B && A == C && A== D) System.out.println(8);
			else if(A > 0 && B > 0 && C > 0 && D > 0) System.out.println(2);
			else System.out.println(1);
		}
	}
	
	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
	
	// 12836번 - 가계부 (Easy)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		long[] arr = new long[N + 1];
		
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 1) {
				arr[Integer.parseInt(st.nextToken())] += Integer.parseInt(st.nextToken());
			} else {
				
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				
				long total = 0;
				for(int j = start; j <= end; j++) {
					total += arr[j];
				}
				
				System.out.println(total);
			}
		}
		
	}
	
	// 1996번 - 지뢰 찾기
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] map = new char[N + 2][N + 2];
		for(int i = 1; i < N + 1; i++) {
			String input = br.readLine();
			
			for(int j = 1; j < N + 1; j++) {
				map[i][j] = input.charAt(j - 1);
			}
		}
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) {
				
				if(map[i][j] != '.' ) sb.append("*");
				
				else if(map[i][j] == '.'){
					int cnt = 0;
					
					cnt += (Character.getNumericValue(map[i - 1][j]) == -1 ) ? 0 : Character.getNumericValue(map[i - 1][j]);
					cnt += (Character.getNumericValue(map[i][j - 1]) == -1) ? 0 : Character.getNumericValue(map[i][j - 1]);
					cnt += (Character.getNumericValue(map[i - 1][j - 1]) == -1) ? 0 : Character.getNumericValue(map[i - 1][j - 1]);
					cnt += (Character.getNumericValue(map[i + 1][j]) == -1) ? 0 : Character.getNumericValue(map[i + 1][j]);
					cnt += (Character.getNumericValue(map[i][j + 1]) == -1) ? 0 : Character.getNumericValue(map[i][j + 1]);
					cnt += (Character.getNumericValue(map[i - 1][j + 1]) == - 1) ? 0 : Character.getNumericValue(map[i - 1][j + 1]);
					cnt += (Character.getNumericValue(map[i + 1][j + 1]) == - 1) ? 0 : Character.getNumericValue(map[i + 1][j + 1]);
					cnt += (Character.getNumericValue(map[i + 1][j - 1]) == - 1) ? 0 : Character.getNumericValue(map[i + 1][j - 1]);
					if(cnt >= 10) sb.append("M");
					else sb.append(cnt);
				}
				
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
	
	// 1051번 - 숫자 정사각형
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			for(int j = 0; j < M; j++) map[i][j] = Character.getNumericValue(temp.charAt(j));
		}
		
		
		int len = Math.min(N, M);
        while(len > 1) {
        	
            for(int i = 0; i <= N - len; i++) {
                for(int j = 0; j <= M - len; j++) {
                    int num = map[i][j];
                    if(num == map[i][j + len - 1] && num == map[i + len - 1][j] && num == map[i + len - 1][j + len - 1]) {
                        System.out.println(len * len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len * len);
	}
	
	// 1205번 - 등수 구하기
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int point = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		if(N > 0) {
			
			int[] ranking = new int[N];
            st = new StringTokenizer(br.readLine());
            
			for (int i = 0; i < N; i++) ranking[i] = Integer.parseInt(st.nextToken());

			if (N == P && ranking[N - 1] >= point) System.out.println(-1);

			else {

				int rank = N + 1;
                
				for (int i = 0; i < N; i++) {
                
					if (ranking[i] <= point) {
                        rank = i + 1;
                        break;
                    }
					
                }
				
                System.out.println(rank);

			}
			
		} else {
			System.out.println(1);
		}
		
	}
	
	// 1173번 - 운동
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer  st = new StringTokenizer(br.readLine());
	
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			long get = measure(temp);
			
			if(temp == get) sb.append("Perfect");
			else if(temp < get) sb.append("Abundant");
			else sb.append("Deficient");
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	private static long measure(int N) {
		
		long ans = 0;
		
		for(int i = 1; i < N; i++) {
			if(N % i == 0) ans += i;
			
			if(ans > N) return ans;
		}
		
		return ans;
	}
	
	// 10040번 - 투표 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] voted = new int[N];
		for(int i = 0; i < N; i++) voted[i] = 0;
		
		int[] cost = new int[N];
		for(int i = 0; i < N; i++) cost[i] = Integer.parseInt(br.readLine());
		
		int[] standard = new int[M];
		for(int i = 0; i < M; i++) standard[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < M; i++) {
			
			for(int j = 0; j < N; j++) {
				if(standard[i] >= cost[j]) {
					voted[j]++;
					break;
				}
			}
		}
		
		int max = 0;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(voted[i] > max) {
				max = voted[i];
				ans = i;
			}
		}
		
		System.out.println(ans + 1);
	}
	
	
	
}
