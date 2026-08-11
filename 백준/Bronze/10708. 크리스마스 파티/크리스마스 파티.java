import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] target = new int[M];
		int[] point = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) target[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				
				if(target[i] == temp) point[j]++;
				else point[target[i] - 1]++;
			}
		}
		
		for(int i = 0; i < N; i++) System.out.println(point[i]);
		
	}
}
