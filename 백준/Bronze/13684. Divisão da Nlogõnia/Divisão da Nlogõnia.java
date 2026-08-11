import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int K = Integer.parseInt(br.readLine());
			if(K == 0) break;
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
	
			while(K --> 0) {
				
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				
				if(X == N || Y == M) sb.append("divisa");
				else {
					
					if(X >= N && Y >= M) sb.append("NE");
					if(X >= N && Y < M) sb.append("SE");
					if(X < N && Y >= M) sb.append("NO");
					if(X < N && Y < M) sb.append("SO");
					
				}
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
