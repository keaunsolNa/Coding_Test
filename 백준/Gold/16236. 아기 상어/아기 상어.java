import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int[] dx = {1, 0, -1, 0};
	private static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		
        int[] cur = null;

        // 맵 설정 및 초기 상어값 cur 변수 할당
        for (int i = 0; i < N; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	
        	for (int j = 0; j < N; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        		
        		if (map[i][j] == 9) {
        			cur = new int[]{i, j};
        			map[i][j] = 0;
        		}
        		
        	}	
        }
        
        // 최초 사이즈
        int nowSize = 2;
        
        // 먹은 물고기 숫자
        int eat = 0; 
        
        // 움직인 거리
        int move = 0; 
        
        while (true) {
        	
        	// 우선순위 큐. 
            PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) ->
                    o1[2] != o2[2] 
                    				? Integer.compare(o1[2], o2[2]) : (o1[0] != o2[0] 
                    				? Integer.compare(o1[0], o2[0]) : Integer.compare(o1[1], o2[1]))
            
            		);
            
            // dfs visit 변수
            boolean[][] visit = new boolean[N][N];

            // 우선순위 큐에 x, y 좌표. 총 이동 거리 int 배열 초기값
            que.add(new int[]{cur[0], cur[1], 0});
            
            visit[cur[0]][cur[1]] = true;

            boolean ck = false; 

            while (!que.isEmpty()) {
            	
                cur = que.poll();

                // map에 먹이가 존재하고 상어의 사이즈보다 작은 경우
                if (map[cur[0]][cur[1]] != 0 && map[cur[0]][cur[1]] < nowSize) { 
                	
                	// 해당 위치 물고기 제거
                    map[cur[0]][cur[1]] = 0; 
                    eat++; 
                    move += cur[2]; 
                    ck = true; 
                    break;
                    
                }

                for (int k = 0; k < 4; k++) {
                	
                    int ny = cur[0] + dy[k];
                    int nx = cur[1] + dx[k];

                    if (ny < 0 || nx < 0 || nx >= N || ny >= N || visit[ny][nx] || map[ny][nx] > nowSize) continue;

                    que.add(new int[]{ny, nx, cur[2] + 1});
                    visit[ny][nx] = true;
                    
                }
            }

            // 큐가 비워질 때까지 먹이를 먹은적이 없다면, 더 이상 먹은 물고기가 없으므로 탈출
            if (!ck) break;

            // 사이즈와 먹이를 먹은 수가 동일하다면 상어의 크기를 증가
            if (nowSize == eat) { 
            	nowSize++;
                eat = 0;
            }
        }
        System.out.println(move);
	}
}
