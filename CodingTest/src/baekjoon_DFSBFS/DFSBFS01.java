package baekjoon_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSBFS01 {
    private static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}
	
	// 바이러스
	public static void test01() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int node = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[node][node];
        boolean[] visit = new boolean[arr.length];
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++){
        	
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken()) -1;
            int b = Integer.parseInt(st.nextToken()) -1;

            arr[a][b] = true;
            arr[b][a] = true;

        }

        int result = search(arr, visit, 0);

        System.out.println(result -1);
	}
	
	// 바이러스 DFS
    public static int search(boolean[][] arr, boolean[] visit, int start) {
        int result = 1;

        visit[start] = true;
        for (int i = 0 ; i < arr.length ; i++) if(arr[start][i] && !visit[i]) result += search(arr, visit, i);
        
        return result;
    }
	
    private static boolean visited[];
	
      
	private static int[] visit;

    
	// 숨바꼭질
	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        if (n == k) {
            System.out.println(0);
            return;
        }
        
        boolean[] visited = new boolean[100001];
        visited[n] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        int size = q.size();
        int count = 0;
        
        while (true) {
            count++;
            size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.remove();
                visited[x] = true;
                if (x-1 == k || x+1 == k || x*2 == k) {
                    System.out.println(count);
                    return;
                }
                if (x-1 >= 0 && !visited[x-1]) {
                    visited[x-1] = true;
                    q.add(x-1);
                }
                if (x+1 <= 100000 && !visited[x+1]) {
                    visited[x+1] = true;
                    q.add(x+1);
                }
                if (x*2 <= 100000 && !visited[x*2]) {
                    visited[x*2] = true;
                    q.add(x*2);
                }
            }
        }
	}


}
