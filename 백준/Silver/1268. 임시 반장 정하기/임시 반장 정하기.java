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

	private static int N; 
	private static int cnt;

	public static void main(String[] args) throws IOException {
		test05();
	}

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
}
