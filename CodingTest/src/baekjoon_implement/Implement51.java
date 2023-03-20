package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;


public class Implement51 {
   
    private static class Node {
        int x; 
        int y;
        
        private Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    private static int n, l, r;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static ArrayList<Node> list;
    
	public static void main(String[] args) throws IOException {
		test09();
	}
	
	// 16234번 - 인구 이동
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        
        map = new int[n][n];
        for(int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) map[i][j] = Integer.parseInt(st.nextToken());
            
        }

        System.out.println(move());
        
	}
	
    private static int move() {
    	
    	int result = 0;
        
    	while(true) {
        
    		boolean isMove = false;
            visited = new boolean[n][n];
            
            for(int i = 0; i < n; i++) {
            
            	for(int j = 0; j < n; j++) {
                
            		if(!visited[i][j]) {
                    
            			int sum = bfs(i, j); 
            			
                        if(list.size() > 1) {
                            changePopulation(sum); 
                            isMove = true;
                        }    
                    }
                }
            }
            
            if(!isMove) return result;
            result++;
        }
    }
    
    private static int bfs(int x, int y) {

    	Queue<Node> q = new LinkedList<>();
        list = new ArrayList<>();
        
        q.offer(new Node(x, y));
        list.add(new Node(x, y));
        visited[x][y] = true;
        
        int sum = map[x][y];
        
        while(!q.isEmpty()) {
        	
            Node current = q.poll();
            
            for(int i = 0; i < 4; i++) {
            	
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                	
                    int diff = Math.abs(map[current.x][current.y] - map[nx][ny]);
                    
                    if(l <= diff && diff <= r) {
                    	
                        q.offer(new Node(nx, ny));
                        list.add(new Node(nx, ny));
                        sum += map[nx][ny];
                        visited[nx][ny] = true;
                        
                    }        
                }
            }
        }
        
        return sum;
    }
    
    private static void changePopulation(int sum) {

    	int avg = sum / list.size();
        for(Node n : list) map[n.x][n.y] = avg;
        
    }
    
	// 12919번 A와 B 2
    private static String S;
    private static String T;
    private static int legnth;
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		S = br.readLine();
		T = br.readLine();
		legnth = S.length();

		System.out.println(solve(T) ? 1 : 0);
	}
	
    private static boolean solve(String str) {
    	
    	if(str.length() == legnth) {
            if(str.equals(S)) return true;
            return false;
        }

        if(str.charAt(str.length() -1) == 'A') 
            if(solve(str.substring(0, str.length() -1))) return true;

        if(str.charAt(0) == 'B') {        
        	
            StringBuilder reverse = new StringBuilder();
            reverse.append(str.substring(1, str.length()));
            if(solve(reverse.reverse().toString())) return true;
            
        }
        
        return false;
    }
    
	// 14542번 - Outer Triangle Sum
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			
			int T = Integer.parseInt(input);
			int TC = 1;
			List<List<Long>> arr = new ArrayList<>();
			
			for(int i = 0; i < T; i++) {
			
				arr.add(new ArrayList<Long>());
				st = new StringTokenizer(br.readLine());
				while(st.hasMoreTokens()) 
					arr.get(i).add(Long.parseLong(st.nextToken()));
			}

			long sum = 0;
			for(int i = 0; i < T; i++) sum += arr.get(i).get(0);
			
			for(int i = 1; i < T; i++) {
				
				if(i == T - 1) for(int j = 1; j < T; j++) sum += arr.get(i).get(j);
				
				else if(i > 0 && i < T - 1) {
					sum += arr.get(i).get(arr.get(i).size() - 1);
				}
				
			}
			
			sb.append("Case #" + TC + ":" + sum + "\n");
			TC++;
		}
		
		System.out.print(sb);
	}
	
	// 27736번 - 찬반투표 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int aggre = 0;
		int denial = 0;
		int abstention = 0;
		
		for(int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			if(input == 1) aggre++;
			else if(input == -1) denial++;
			else abstention++;
			
		}
		
		if((double)abstention >= (double)N / 2) System.out.println("INVALID");
		else if(aggre > denial) System.out.println("APPROVED");
		else System.out.println("REJECTED");
		
	}
	
	// 1268번 - 임시 반장 정하기
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][5];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			for(int j = 0; j < 5; j++) 
				arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		int cnt2 = 0;
		for(int i = 0; i < N; i++) {
			
			Set<Integer> set = new HashSet<>();
			
			for(int j = 0; j < 5; j++) {
				
				for(int k = 0; k < N; k++) {
					
					if(i == k) continue;
					
					if(arr[i][j] == arr[k][j]) {
						set.add(k);
					}
				}
			}
			
			if(cnt2 < set.size()) {
				cnt2 = set.size();
				cnt = i + 1;
			}
		}

		if(cnt == 0) System.out.println(1);
		else System.out.println(cnt);
		
	}

	// 17072번 - 아스키 아트
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				
				int r = Integer.parseInt(st.nextToken());
				int g = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int rgb = (2126 * r) + (7152 * g) + (722 * b);
				
	            if (0 <= rgb && rgb < 510000)
	            	sb.append(String.format("%c", 35));
	            else if (510000 <= rgb && rgb < 1020000)
	            	sb.append(String.format("%c", 111));
	            else if (1020000 <= rgb && rgb < 1530000)
	            	sb.append(String.format("%c", 43));
	            else if (1530000 <= rgb && rgb < 2040000)
	            	sb.append(String.format("%c", 45));
	            else
	            	sb.append(String.format("%c", 46));
	            
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	// 20113 - 긴급 회의
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) 
			arr[Integer.parseInt(st.nextToken())]++;
		
		int max = 0;
		int idx = 0;
		
		for(int i = 1; i <= N; i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		
		for(int i = 1; i <= N; i++) {
			if(idx != i && arr[i] == max) {
				System.out.println("skipped");
				return;
			}
		}
		
		System.out.println(idx);
	}
	
	// 6246번 - 풍선 놀이
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		boolean[] chk = new boolean[N + 1];
		for(int i = 0; i < Q; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int term = Integer.parseInt(st.nextToken());
			
			for(int j = start; j <= N; j += term) chk[j] = true;
		}
		
		int ans = 0;
		for(int i = 1; i <= N; i++) if(!chk[i]) ans++;
		
		
		System.out.println(ans);
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
