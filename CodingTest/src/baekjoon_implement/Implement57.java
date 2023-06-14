package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement57 {
    
	public static void main(String[] args) throws IOException {
		test05();
	}
	
	// 10219번 - Meats On The Grill 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = N;

		while(cnt!=0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());        
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            char[][] arr= new char[H][W];
            
            for(int i = 0; i < H; i++) {
            
            	String temp = br.readLine();
                for(int j = 0; j < W; j++) arr[i][j] = temp.charAt(j);

            }
            
            for(int i = 0; i < H; i++) {
            
            	for(int j = W - 1; j >= 0; j--) System.out.print(arr[i][j]);
                System.out.print("\n");

            }

            cnt--;

		}
	}
	
	// 4606번 The Seven Percent Solution 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		while(!(input = br.readLine()).equals("#")) {
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < input.length(); i++) {
				
				if(input.charAt(i) == ' ') sb.append("%20"); 
				else if(input.charAt(i) == '!') sb.append("%21"); 
				else if(input.charAt(i) == '$') sb.append("%24"); 
				else if(input.charAt(i) == '%') sb.append("%25"); 
				else if(input.charAt(i) == '(') sb.append("%28"); 
				else if(input.charAt(i) == ')') sb.append("%29"); 
				else if(input.charAt(i) == '*') sb.append("%2a"); 
				else sb.append(input.charAt(i));
				
			}
			
			System.out.println(sb);
		}
	}
	
	// 1331번 - 나이트 투어
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int moveX[] = {1, 2, 2, 1, -1, -2, -2, -1};
		int moveY[] = {2, 1, -1, -2, -2, -1, 1, 2};
		boolean visit[][] = new boolean[6][6];
		String str[] = new String[37];
		
		for(int i = 0; i < 36; i++) str[i] = br.readLine();
		
		str[36] = str[0];
		int idx = 0;
		boolean chk = true;
		
		while(idx < 36) {
			
			String current = str[idx];
			String next = str[idx + 1];
			
			char currentX = current.charAt(0);
            char currentY = current.charAt(1);
            
            visit[currentY - '0' - 1][currentX - 'A'] = true;
            
            char nextX = next.charAt(0);
            char nextY = next.charAt(1);
            
            int diffX = Math.abs(currentX - nextX);
            int diffY = Math.abs(currentY - nextY);
            boolean isTrue = false;
            
            for(int d = 0; d < 8; d++) {
                if(moveX[d] == diffX && moveY[d] == diffY) {
                    isTrue = true;
                    break;
                }
            }
            
            if(!isTrue) {
            	chk = false;
                System.out.println("Invalid");
                return;
            }
            
            if(visit[nextY - '0' - 1][nextX - 'A']) {
                if(idx != 35) {
                	chk = false;
                    System.out.println("Invalid");
                    return;
                }
            }
            
            idx++;
            
		}
		
		if(chk) System.out.println("Valid");
		
	}
	
	// 1531번 - 투명
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[100][100];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int leftX = Integer.parseInt(st.nextToken()) - 1;
			int leftY = Integer.parseInt(st.nextToken()) - 1;
			int rightX = Integer.parseInt(st.nextToken()) - 1;
			int rightY = Integer.parseInt(st.nextToken()) - 1;
			
			for(int idx = leftX; idx <= rightX; idx++) {
				
				for(int idx2 = leftY; idx2 <= rightY; idx2++) {
					
					map[idx][idx2]++;
				}
			}
			
		}
		
		int ans = 0;
		for(int i = 0; i < 100; i++) {
			
			for(int j = 0; j < 100; j++) {
				
				if(map[i][j] > M) ans++;
			}
		}
		
		System.out.println(ans);
		
	}
	
	// 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	// 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
}
