package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Implement57 {
    
	public static void main(String[] args) throws IOException {
		test10();
	}

	private static class Pair implements Comparable<Pair> {
        
		int number;
        int player;
        
        Pair(int number, int player) {
        	this.number = number; 
        	this.player = player;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.number, o.number);
        }
        
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
	
	// 25850번 - A Game Called Mind 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for(int p = 0; p < N; p++) {
			
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < t; i++) pq.add(new Pair(Integer.parseInt(st.nextToken()), p));
				
		}
		
		while(!pq.isEmpty()) {
			
			sb.append((char)(pq.poll().player + 'A'));
		}
		
		System.out.println(sb);
	}
	
	// 26535번 - Chicken Pen 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int chicken = (int)Math.ceil(Math.sqrt(Integer.parseInt(br.readLine())));
		for(int i = 0; i < chicken + 2; i++) sb.append("x");
		
		
		sb.append("\n");
		
		for(int o = 0; o < chicken; o++) {
			
			for(int i = 0; i < chicken + 2; i++) {
				
				if(i == 0 || i == chicken + 1) sb.append("x");
				else sb.append(".");
			}
			
			sb.append("\n");
			
		}
		
		for(int i = 0; i < chicken + 2; i++) sb.append("x");
		
		System.out.println(sb);
		
	}
	
	// 26510번 - V for Vendetta 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String two   = "* *\n *";
		String three = "*   *\n * *\n  *";
		String four  = "*     *\n *   *\n  * *\n   *";
		String five  = "*       *\n *     *\n  *   *\n   * *\n    *";
		String six   = "*         *\n *       *\n  *     *\n   *   *\n    * *\n     *";
		String seven = "*           *\n *         *\n  *       *\n   *     *\n    *   *\n     * *\n      *";
		String eight = "*             *\n *           *\n  *         *\n   *       *\n    *     *\n     *   *\n      * *\n       *";
		String nine  = "*               *\n *             *\n  *           *\n   *         *\n    *       *\n     *     *\n      *   *\n       * *\n        *";
		
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			
			switch(Integer.parseInt(st.nextToken())) {
				
				case 2 : sb.append(two); break;
				case 3 : sb.append(three); break;
				case 4 : sb.append(four); break;
				case 5 : sb.append(five); break;
				case 6 : sb.append(six); break;
				case 7 : sb.append(seven); break;
				case 8 : sb.append(eight); break;
				case 9 : sb.append(nine); break;
				
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.print(sb);
	}
	
	// 5246번 - Checkerboard Rows
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int board = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < board; i++) {
			
			st = new StringTokenizer(br.readLine());
            int cntPieces = Integer.parseInt(st.nextToken());
            int[] rows = new int[8];
            
            for (int j = 0; j < cntPieces; j++) {
            	
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                rows[y - 1]++;
                
            }

            int maxPieces = Arrays.stream(rows).max().getAsInt();
            
            System.out.println(maxPieces);
        }

	}
	
	// 6856번 - Roll the Dice
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int ans = 0;
		for(int i = 1; i <= a; i++) {
			
			for(int j = 1; j <= b; j++) {
				
				if(i + j == 10) ans++;
			}
		}
		
		if(ans == 1) System.out.println("There is 1 way to get the sum 10."); 
		else if(ans > 1) System.out.println("There are " + ans +" ways to get the sum 10.");
			
	}
	
	// 10994번 - 별 찍기 - 19
	private static char[][] star;
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        n = 4 * n - 3;
        star = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ' ';
            }
        }

        solve(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }

    public static void solve(int s, int len) {
        if (len<=s) return;

        for (int i = s; i < len; i++) {
            star[s][i] = '*'; 
            star[len - 1][i] = '*'; 
            star[i][s] = '*';
            star[i][len - 1] = '*'; 
        }


        solve(s + 2, len - 2);
    }
	
}
