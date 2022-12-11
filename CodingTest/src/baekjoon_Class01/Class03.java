package baekjoon_Class01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Class03 {

	public static void main(String[] args) throws IOException {
		test03();
	}
	
	// 피보나치 함수
	static Integer[][] dp = new Integer[41][2];
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[0][0] = 1;	
		dp[0][1] = 0;	
		dp[1][0] = 0;	
		dp[1][1] = 1;	
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T --> 0){
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
		}
		System.out.println(sb);
	}
	
	static Integer[] fibonacci(int N) {
		if(dp[N][0] == null || dp[N][1] == null) {
			
			dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
			dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
		}
		
		return dp[N];
	}
    

    // 유기농 배추
	static int dirX[] = {0, 0, -1, 1};
	static int dirY[] = {-1, 1, 0, 0};
	static int map[][];
	static boolean visit[][];

	static int now_x, now_y;
	static int M, N, K;
	static int count;
    public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			map = new int[N][M];
			visit = new boolean[N][M];

			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}

			count = 0;
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {

					if(map[j][k] == 1 && visit[j][k] == false) {
						count++;
						DFS(k, j);
					}
				}
			}
			sb.append(count).append('\n');
		}

		System.out.println(sb);
    }
    
	public static void DFS(int x, int y) {
		visit[y][x] = true;

		for(int i=0; i<4; i++) {
			now_x = x + dirX[i];
			now_y = y + dirY[i];

			if(Range_check() && visit[now_y][now_x] == false && map[now_y][now_x] == 1) {
				DFS(now_x, now_y);
			}

		}
	}

	static boolean Range_check() {
		return (now_y < N && now_y >= 0 && now_x < M && now_x >= 0);
	}

    // Z
	static int cnt = 0;
    public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int size = (int)Math.pow(2, N);
				
		find(size, r, c);
		
		System.out.println(cnt);
    }
    
    public static void find(int size, int r, int c) {
		if(size == 1)
			return;
		
		if(r < size/2 && c < size/2) {
			find(size/2, r, c);
		}
		else if(r < size/2 && c >= size/2) {
			cnt += size * size / 4;
			find(size/2, r, c - size/2);
		}
		else if(r >= size/2 && c < size/2) {
			cnt += (size * size / 4) * 2;
			find(size/2, r - size/2, c);
		}
		else {
			cnt += (size * size / 4) * 3;
			find(size/2, r - size/2, c - size/2);
		}
    }

    // 팰린드롬 수
    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    // 영화감독 숌
    public static void test05() {
    }

    // 랜선 자르기
    public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    }
    

    // 스택 수열
    public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }

    // 수 찾기
    public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }


    // 소수 구하기
    public static void test09() {
        Scanner sc = new Scanner(System.in);
		
    }
    
    // 프린터 큐
    public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());	

	}
    // 통계학
    public static void test12() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
    }
    
    // 카드2
    public static void test13() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
    }

    // 분해합
    public static void test14() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
    }

    // 벌집
    public static void test15() {
		Scanner sc = new Scanner(System.in);
    }
    
    // 최대공약수와 최소공배수
    public static void test16() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    }

    // 수 정렬하기 2
    public static void test17() {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int testCase = sc.nextInt();
		
    }

    // 부녀회장이 될테야
    public static void test18() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();		
    }

    // 블랙잭
    public static void test19() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
    }
    
	// 나무 자르기
	public static void test20() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}

	// 설탕 배달
	public static void test21() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
	}

	// 달팽이는 올라가고 싶다.
	public static void test22() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}
	
	// 직각 삼각형
	public static void test23() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	// 균형잡힌 세상
	public static void test24() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	}
		
	// 덩치
	public static void test25() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
	}
	
	// 괄호
	public static void test26() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
	}
	
	// ACM 호텔
	public static void test27() throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
	}

	// 제로 
	public static void test28() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
	}

	// 나이순 정렬
	public static void test29() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
	}
	
	// 수자 카드 2
	public static void test30() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	}
	
	// 스택
	public static void test31() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
	}

	// 큐
	public static void test32() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
	}
	
	// 덱
	public static void test33() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order = Integer.parseInt(br.readLine());
	}

	// 수 정렬하기 3
	public static void test34() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
	}
	
	// 이항 계수 1
	public static void test35() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	}
   
	
	// 좌표 정렬하기
	public static void test36() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	// 요세푸스 문제 0
	public static void test37() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
	}
	
	// Hashing 
	public static void test38() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	// 마인크래프트
	public static void test39() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	}
}
