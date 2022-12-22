package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test16_Backtracking {
	
	private static int[] arr;
	private static boolean[] visit;
	private static int N;
	private static int M;
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		test08();
	}
	
	// N과 M (1)
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		dfs(0);
		System.out.println(sb);
		
	}
	
	// N과 M DFS Method
	public static void dfs(int depth) {
		if (depth == M) {
			
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visit[i] = false;
			}
		}
	}
	
	// N과 M (2)
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs2(1, 0);
		
		System.out.println(sb);
		
	}
	
	// N과 M(2) DFS Method
	public static void dfs2(int sortTarget, int depth) {
		
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			
			sb.append("\n");
			return;
		}
 
		for (int i = sortTarget; i <= N; i++) {
			
			arr[depth] = i;
			dfs2(i + 1, depth + 1);
		}
	}
	
	// N과 M (3)
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs3(0);
		
		System.out.println(sb);
		
	}
	
	// N과 M(3) DFS Method
	public static void dfs3(int depth) {
		
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			
			sb.append("\n");
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			
			arr[depth] = i;
			dfs3(depth + 1);
		}
	}
	
	// N과 M (4)
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		dfs4(1, 0);
		
		System.out.println(sb);
	}
	
	// N과 M(4) DFS Method
	public static void dfs4(int sorted, int depth) {
		
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			
			sb.append("\n");
			return;
		}
 
		for (int i = sorted; i <= N; i++) {
			arr[depth] = i;
			dfs4(i, depth + 1);
		}
	}

	// N-Queen
	private static int count = 0;
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        makeArr(N);
        System.out.println(count);
	}
	
	// N-Queen 배열 생성 Method
    public static void makeArr(int N) {
        int[] a = new int[N];
        countArr(a, 0);
    }
    
	// N-Queen 유효 Count Method
    public static void countArr(int[] q, int n) {
        int N = q.length;
        
        if (n == N) {
        	
            count++;
            
        } else {
        	
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (checking(q, n)) countArr(q, n + 1);   
            }
            
        }
    }
    
    //  N-Queen 백트래킹 유망성 검사
    public static boolean checking(int[] q, int n) {
    	
        for (int i = 0; i < n; i++) {
        	
            if (q[i] == q[n]) return false;   // 같은 열
            if ((q[i] - q[n]) == (n - i)) return false;   // '\' 방향
            if ((q[n] - q[i]) == (n - i)) return false;   // '/' 방향
            
        }
        
        return true;
    }
    
    // 스도쿠
    private static int[][] sudoku = new int[9][9];
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		sudoku(0, 0);
		
	}
	
	// 스도쿠 StringBuilder 값 대입 Method
	public static void sudoku(int row, int col) {
		 
		// 해당 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
 
		// 행과 열이 모두 채워졌을 경우 출력 후 종료
		if (row == 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(sudoku[i][j]).append(' ');
				}
				sb.deleteCharAt(sb.length()-1);
				sb.append('\n');
			}
			
			sb.deleteCharAt(sb.length()-1);
			System.out.print(sb);
			System.exit(0);
		}
 
		// 만약 해당 위치의 값이 0 이라면 1부터 9까지 중 가능한 수 탐색
		if (sudoku[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				// i 값이 중복되지 않는지 검사
				if (checking(row, col, i)) {
					sudoku[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			sudoku[row][col] = 0;
			return;
		}
 
		sudoku(row, col + 1);
 
	}
	
	// 스도쿠 유망성 검사
	public static boolean checking(int row, int col, int value) {
		 
		// 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[row][i] == value) {
				return false;
			}
		}
 
		// 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][col] == value) {
				return false;
			}
		}
 
		// 3*3 칸에 중복되는 원소가 있는지 검사
		int set_row = (row / 3) * 3; // value가 속한 3x3의 행의 첫 위치
		int set_col = (col / 3) * 3; // value가 속한 3x3의 열의 첫 위치
 
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (sudoku[i][j] == value) {
					return false;
				}
			}
		}
 
		return true; // 중복되는 것이 없을 경우 true 반환
	}

	//연산자 끼워넣기
	private static int numbers[];
	private static int operator[];
	private static int MAX = -1000000000;
	private static int MIN = 1000000000;
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		numbers = new int[N];
		operator = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		operatorDfs(numbers[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	// 연산자 끼워넣기 DFS Method
 	public static void operatorDfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			
			if(operator[i] > 0) {
				
				operator[i]--;
				
				switch(i) {
				
				case 0 : operatorDfs(num + numbers[idx], idx +1); break;
				case 1 : operatorDfs(num - numbers[idx], idx +1); break;
				case 2 : operatorDfs(num * numbers[idx], idx +1); break;
				case 3 : operatorDfs(num / numbers[idx], idx +1); break;
				
				}
				
				operator[i]++;
			}
		}
	}   

 	// 스타트와 링크
	static int[][] pointMap;
	static int Min = Integer.MAX_VALUE;
	public static void test08() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		N = Integer.parseInt(br.readLine());
 
		pointMap = new int[N][N];
		visit = new boolean[N];
 
 
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
			for (int j = 0; j < N; j++) {
				pointMap[i][j] = Integer.parseInt(st.nextToken());
			}
		}
 
		makeTeam(0, 0);
		System.out.println(Min);
	}
	
	// 스타트와 링크 팀 짜기 DFS
	static void makeTeam(int idx, int depth) {
		// 팀 조합이 완성될 경우
		if(depth == N / 2) {
			/*
			 방문한 팀과 방문하지 않은 팀을 각각 나누어
			 각 팀의 점수를 구한 뒤 최솟값을 찾는다.
			*/
			diff();
			return;
		}
 
		for(int i = idx; i < N; i++) {
			// 방문하지 않았다면?
			if(!visit[i]) {
				visit[i] = true;	// 방문으로 변경
				makeTeam(i + 1, depth + 1);	// 재귀 호출
				visit[i] = false;	// 재귀가 끝나면 비방문으로 변경
			}
		}
	}
 
	// 스타트와 링크 점수 차이 계산 DFS
	static void diff() {
		int ts = 0;
		int tl = 0;
 
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				// i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스 
				if (visit[i] == true && visit[j] == true) {
					ts += pointMap[i][j];
					ts += pointMap[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스 
				else if (visit[i] == false && visit[j] == false) {
					tl += pointMap[i][j];
					tl += pointMap[j][i];
				}
			}
		}
		// 두 팀의 점수 차이 (절댓값)
		int val = Math.abs(ts - tl);
		
		/*
		  두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
		  더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
		 */
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		Min = Math.min(val, Min);
				
	}
}
