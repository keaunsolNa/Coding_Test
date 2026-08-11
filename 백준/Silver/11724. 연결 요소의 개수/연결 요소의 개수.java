import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int N9;
	private static int M9;
	private static boolean[][] graph9 = new boolean[1001][1001];
	private static boolean[] visited9 = new boolean[1001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		N9 = Integer.parseInt(st.nextToken());
		M9 = Integer.parseInt(st.nextToken());
		
		int a;
		int b;
		
		for(int i = 0; i < M9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			graph9[a][b] = graph9[b][a] = true;
		}
        
		int result = 0 ;
		
		for(int i = 1; i <= N9; i++) {
			if(visited9[i] == false) { 
				dfs9(i);
				result++;
			}
		}
		
		System.out.println(result);
	}

	private static void dfs9(int index) {
		if(visited9[index]) return;
		else {
			visited9[index] = true;
			for(int i = 1; i <= N9; i++) if(graph9[index][i]) dfs9(i);
		}
	}
}
