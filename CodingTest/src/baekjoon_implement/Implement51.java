package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
		test02();
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
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder key = new StringBuilder(br.readLine());
		StringBuilder T = new StringBuilder(br.readLine());
		
		while(T.length() != key.length()) {
				
			if(T.charAt(T.length() - 1) == 'A') T.deleteCharAt(T.length() - 1);
			else {
				System.out.println(T);
				T.reverse();
				T.deleteCharAt(0);
				System.out.println(T);
			}
		}
		
		System.out.println(T.equals(key) ? 1 : 0);
	}
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
	}
	
	// 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
	}
	
	
}
