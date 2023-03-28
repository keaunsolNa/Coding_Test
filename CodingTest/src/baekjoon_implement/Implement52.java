package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Implement52 {
    
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// 27889번 - 특별한 학교 이름
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		switch(br.readLine()) {
		
			case "NLCS" : System.out.println("North London Collegiate School"); break;
			case "BHA" : System.out.println("Branksome Hall Asia"); break;
			case "KIS" : System.out.println("Korea International School"); break;
			case "SJA" : System.out.println("St. Johnsbury Academy"); break;
		
		}
        
	}
	
	// 27918번 - 탁구 경기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int D = 0;
		int P = 0;
		while(N --> 0) {
			
			char temp = br.readLine().charAt(0);
			
			if(temp == 'D') D++;
			else P++;
			
			if(Math.abs(D - P) >= 2) break;
			
		}
		
		System.out.println(D + ":" + P);
	}
	
	// 18228번 - 펭귄추락대책위원회
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		List<Integer> prevList = new ArrayList<>();
		List<Integer> nextList = new ArrayList<>();

		boolean isPrev = true;
		for(int i = 0; i < N; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp == -1) {
				isPrev = false;
				continue;
			}
			
			if(isPrev) prevList.add(temp);
			else nextList.add(temp);
			
		}
		
		Collections.sort(prevList);
		Collections.sort(nextList);

		System.out.println(prevList.get(0) + nextList.get(0));
	}
	
	// 5343번 - Parity Bit
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N --> 0) {
			String input = br.readLine();
			int ans = 0;
			
			int len = input.length();
			int count = 0;

			for(int j = 0; j < len / 8; j++) {
				
				for(int i = 0; i < 8; i++) {
					
					if(i != 7) {
						if(input.charAt(j * 8 + i) == '1') count++;
					}
					
					else if(i == 7) { 
						
						if(count % 2 == 0 && input.charAt(j * 8 + i) == '1') ans++;
						else if(count % 2 == 1 && input.charAt(j * 8 + i) == '0') ans++;
						
						count = 0;
					}
					
				}
			}
			System.out.println(ans);
		}
	}
	
	// 1855번 - 암호
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int len = str.length();
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < len / k; j++) {
				sb.append(str.charAt(j % 2 == 0 ? j * k + i : j * k + k - 1 - i));
			}
		}
		
		System.out.println(sb);
	}
	
	// 16019번 - Are we there yet?
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int[] city = new int[5];
		
		city[0] = 0;
		city[1] = Integer.parseInt(st.nextToken());
		city[2] = Integer.parseInt(st.nextToken());
		city[3] = Integer.parseInt(st.nextToken());
		city[4] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 5; i++) {
			
			if(i != 0) {
				int temp = city[i];
				city[i] = city[i - 1];
				city[i - 1] = temp;
			}
			
			int middle = 0;
			for(int j = 0; j < 5; j++) {
				if(city[j] == 0) middle = j;
			}
			
			int[] ans = new int[5];
			for(int j = middle - 1; j >= 0; j--) {
				
				ans[j] += (city[j] + ans[j + 1]);
			}
			
			for(int j = middle + 1; j < 5; j++) {
				
				ans[j] += (city[j] + ans[j - 1]);
			}
			
			for (int j : ans) {
				System.out.print(j +" ");
			}
			
			System.out.println();
		}
		
	}
	
	// 16433번 - 주디와 당근농장
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken()) - 1;
		int C = Integer.parseInt(st.nextToken()) - 1;
		
		char[][] map = new char[N][N];
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				map[i][j] = '.';
			}
		}
		
		map[R][C] = 'v';
		int dy[]= {-1, -1, 1, 1};
		int dx[]= {1, -1, 1, -1};
		Queue<int[]> q=new LinkedList<int[]>();
		
		q.add(new int[] {R, C});
		
		while(!q.isEmpty()) {
			
			int[] p = q.poll();
			
			for(int i = 0; i < 4; i++) {
				int ny = p[0] + dy[i];
				int nx = p[1] + dx[i];
				if(ny >= 0 && nx >= 0 && ny < N && nx < N && map[ny][nx] == '.') {
					map[ny][nx] = 'v';
					q.add(new int[] {ny, nx});
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	// 11949번 - 번호표 교환
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        for (int i = 1; i <= M; i++) {
        	
            for (int j = 1; j < N; j++) {
            	
                if (arr[j - 1] % i > arr[j] % i) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i : arr) System.out.println(i +" ");
		
	}
	
	// 27891번 - 특별한 학교 이름 암호화
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder input = new StringBuilder(br.readLine());

		while(true) {
			
			String ans = check(input.toString());
			
			if(!ans.equals("F")) {
				System.out.println(ans);
				break;
			}
			
			StringBuilder tempStr = new StringBuilder();
			for(int i = 0; i < input.length(); i++) {

				int temp = (int)input.charAt(i);
				temp = temp + 1 > 122 ? 97 : temp + 1;

				tempStr.append((char)temp);
			}
			
			input = tempStr;
		}
	}
	
	private static String check(String input) {

		String NLCS = "northlondo";
		String BHA = "branksomeh";
		String KIS = "koreainter";
		String SJA = "stjohnsbur";
		
		if(input.equals(NLCS)) return "NLCS";
		else if(input.equals(BHA)) return "BHA";
		else if(input.equals(KIS)) return "KIS";
		else if(input.equals(SJA)) return "SJA";
		
		return "F";
	}
	
	// 1236번 - 성 지키기
	public static void test10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
              
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int col = 0;
        int row = 0;
       
        boolean[][] arr = new boolean[N][M];

        for(int i = 0; i < N; i++) {
        	
            String str = br.readLine();
            
            for(int j = 0; j < M; j++) {
           
                if(str.charAt(j) == '.') arr[i][j] = false;
                else arr[i][j] = true;
                
            }
        }
       
        for(int i = 0; i < M; i++) {

        	int count = 0;

            for(int k = 0; k < N; k++) 
                if(arr[k][i] == false) count ++;

            if(count == N) col++;
            
        }

        for(int i = 0; i < N; i++) {
        	
            int count = 0;
            
            for(int k = 0; k < M; k++) 
                if(arr[i][k] == false) count ++;

            if(count == M) row++;
            
        }

        if(row >= col) System.out.println(row);
        else System.out.println(col);
        
	}
	
}
