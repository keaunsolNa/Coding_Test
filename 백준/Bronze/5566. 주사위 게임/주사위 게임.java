import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] map = new int[N];
		for(int i = 0; i < N; i++) map[i] = Integer.parseInt(br.readLine());

		int now = 0;
		int count = 0 ;
		for(int i = 1; i <= M; i++) {
			int roll = Integer.parseInt(br.readLine());
			
			now += roll;
			if(now >= N - 1) {
				count = i;
				break;
			}
			
			int going = map[now];
			now += going;
			
			if(now >= N - 1) {
				count = i;
				break;
			}
			
		}
		
		System.out.println(count);
	}
}
