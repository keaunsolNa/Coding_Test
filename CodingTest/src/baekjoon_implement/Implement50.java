package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Implement50 {
   
	public static void main(String[] args) throws IOException {
		test07();
	}
	
	// 10709번 - 기상캐스터
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++) {
			String input = br.readLine();
			for(int j = 0; j < W; j++) 
				map[i][j] = input.charAt(j);
		}

		int[][] answer = new int[H][W];
		for(int i = 0; i < H; i++) {
			
			int cnt = 1;
			boolean cloud = false;
			for(int j = 0; j < W; j++) {
				
				if(!cloud && map[i][j] != 'c') answer[i][j] = -1;
				
				else if(map[i][j] == 'c' && !cloud) {
					answer[i][j] = 0;
					cloud = true;
				}
				
				else if(cloud && map[i][j] == 'c') {
					answer[i][j] = 0;
					cnt = 1;
				}
				
				else if(cloud && map[i][j] != 'c') {
					answer[i][j] = cnt;
					cnt++;
				}
			}
		}
		
		for (int[] is : answer) {
			
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}
	
	// 5638번 - Escape Route
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			
			char[][] map = new char[N][N];
			int[] s = new int[2];
			for(int i = 0; i < N; i++) {
				
				String str = br.readLine();
				for(int j = 0; j < N; j++) {
					char temp = str.charAt(j);
					map[i][j] = temp;
					
					if(temp == 's') {
						s[0] = i;
						s[1] = j;
					}
					
				}
			}
			double minDis = Double.MAX_VALUE;
			int[] p = new int[2];
			for(int i = 0; i < N; i++) {
				
				for(int j = 0; j < N; j++) {
					
					if(map[i][j] == 'p') {
						double dis = Math.pow((Math.pow(i - s[0], 2) + Math.pow(j - s[1], 2)), 0.5);
						
						if(minDis > dis) {
							
							minDis = Math.min(minDis, dis);
							p[0] = i;
							p[1] = j;
						}
					}
				}
			}
			
			String ans = String.format("%.2f", minDis);
			
			sb.append("(" + s[0] + "," + s[1] + "):(" +p[0] + "," + p[1] + "):" + ans + "\n");
		}
		
		System.out.println(sb);
	}
	
	// 27866번 - 문자와 문자열
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int idx = Integer.parseInt(br.readLine());
		
		System.out.println(input.charAt(idx - 1));
	}
	
	// 9455번 - 박스
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[n][m];
			
			for(int i = 0; i < n; i++) {
				
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < m; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			
			for(int i = 0; i < m; i++) {
				
				String temp = "";
				for(int j = 0; j < n; j++) {
					temp += map[j][i];
					
				}
				
				for(int j = 0; j < temp.length(); j++) {
					
					if(temp.charAt(j) == '1') {
						
						cnt += (int)countChar(temp.substring(j, temp.length()), '0');
					}
				}
			}

			System.out.println(cnt);
		}

	}
	
	public static long countChar(String str, char ch) {
	
		return str.chars()
				.filter(c -> c == ch)
				.count();

	}
	
	// 20205번 - 교수님 그림이 깨지는데요?
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][N];
		
		for(int i = 0; i < N ; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
			
		for(int i = 0; i < N; i++) {
			for(int kx = 0; kx < K; kx++) {
				for(int j = 0; j < N; j++) {
					for(int k = 0; k < K; k++) {
						sb.append(map[i][j] + " ");
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	// 15947번 - 아기 석환 뚜루루 뚜루
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[][] sing = new String[4][];
		sing[0] = new String[4];
		sing[1] = new String[4];
		sing[2] = new String[4];
		sing[3] = new String[2];
		
		sing[0][0] = "baby";
		sing[0][1] = "sukhwan";
		sing[0][2] = "tururu";
		sing[0][3] = "turu";
		
		sing[1][0] = "very";
		sing[1][1] = "cute";
		sing[1][2] = "tururu";
		sing[1][3] = "turu";
		
		sing[2][0] = "in";
		sing[2][1] = "bed";
		sing[2][2] = "tururu";
		sing[2][3] = "turu";

		sing[3][0] = "baby";
		sing[3][1] = "sukhwan";
		
		int outIdx = 0;
		while(N - (14 * outIdx) > 0) {
			outIdx++;
		}
		
		
		outIdx--;
		StringBuilder app = new StringBuilder();
		
		while(outIdx --> 0) app.append("ru");
		
		for(int i = 0; i < 3; i++) {
			
			sing[i][2] += app.toString();
			sing[i][3] += app.toString();
			
		}
		
		N = (N / 15) + (N % 15);
		
		while(true) {
			
			for(int i = 0; i < sing.length; i++) {
				
				for(int j = 0; j < sing[i].length; j++) {
					if(N == 1) {
						
						if(sing[i][j].contains("ru")) {
							int ruCount = (sing[i][j].length() - sing[i][j].replace("ru", "").length()) / 2;
							if(ruCount >= 5) {
								sing[i][j] = "tu+ru*" + ruCount;
								
							}
							System.out.println(sing[i][j]);
						} else {
							System.out.println(sing[i][j]);
						}
						return;
					}
					N--;
				}
			}
		}
	}

	// 9047번 6174
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();

			if(input.equals("6174")) {
				System.out.println(0);
				continue;
			}
			
			int number = solustion(input);
			
			int ans = 1;
			while(number != 6174) {

				ans++;
				input = number+"";
				number = solustion(input);
				
			}
			
			System.out.println(ans);
		}
	}
	
	public static int solustion(String input) {
	
		Integer[] maxArr = Arrays.stream(Arrays.stream(input.split("")).map(String::trim).mapToInt(Integer::parseInt).toArray()).boxed().toArray(Integer[]::new);
		Integer[] minArr = maxArr.clone();
		
		Arrays.sort(minArr);
		Arrays.sort(maxArr, Collections.reverseOrder());
		
        String max = Arrays.stream(maxArr)
                		   .map(String::valueOf)
                		   .reduce((x, y) -> x + "" + y)
                		   .get();
        
        String min = Arrays.stream(minArr)
        		.map(String::valueOf)
        		.reduce((x, y) -> x + "" + y)
        		.get();
		
		int number = (Integer.parseInt(max) - Integer.parseInt(min));
		return number;
		
	}
	
	// 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	}
	
	
	
	
}
