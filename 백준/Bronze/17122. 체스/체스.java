import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		boolean[][] map = new boolean[8][8];
		
		for(int i = 0; i < 8; i++) {
			if(i > 0) if(!map[i - 1][0]) map[i][0] = true;
			for(int j = 0; j < 7; j++) 
				if(!map[i][j]) map[i][j + 1] = true;
			
		}
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			String A = st.nextToken();
			int B = Integer.parseInt(st.nextToken());
			int prev = A.charAt(0) - 'A';
			int next = Integer.parseInt(A.substring(1, A.length())) -1;
			
			if(map[prev][next] == map[(B - 1) % 8][(B - 1) / 8]) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
}
