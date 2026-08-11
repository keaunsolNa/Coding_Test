import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static int n, l, r;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    private static ArrayList<Node> list;

	public static void main(String[] args) throws IOException {
		test01();
	}

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

    private static class Node {
        int x; 
        int y;
        
        private Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
