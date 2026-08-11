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

	public static void main(String[] args) throws IOException {
		test08();
	}

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
}
