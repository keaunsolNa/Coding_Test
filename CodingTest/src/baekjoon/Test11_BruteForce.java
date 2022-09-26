package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test11_BruteForce {
	private static boolean[] visit;
	private static int sumNumber = 0;
	private static int[] result = new int[3];
	public static void main(String[] args) throws IOException {
		test01();
	}
	
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		
		int cardAmount = Integer.parseInt(st.nextToken());
		int keyNumber = Integer.parseInt(st.nextToken());
		
		int[] card = new int[cardAmount];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < cardAmount; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		visit = new boolean[card.length];
		int depth = 0;
		dfs(depth, keyNumber, cardAmount, card);
		
		System.out.println(sumNumber);
	}
	
	public static void dfs(int depth, int keyNumber, int cardAmount, int[] card) {
		
		if(depth == 3) {
			int sum = 0;

			for (int i : result) {
				sum += i;
			}
			
			if (sum > keyNumber) {
				return;
			}
			
			if(sum <= keyNumber) {
				sumNumber = Math.max(sumNumber, sum);
			}
		} else {
			
			for(int i = depth; i < cardAmount; i++) {
				
				if(!visit[i]) {
					visit[i] = true;
					result[depth] = card[i];
					dfs(depth+1, keyNumber, cardAmount, card);
					visit[i] = false;
				}
			}
		}
		
	}
	
}
