import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		for(int i = 0; i < N; i++) {
			String temp = br.readLine();
			for(int j = 0; j < M; j++) map[i][j] = Character.getNumericValue(temp.charAt(j));
		}
		
		
		int len = Math.min(N, M);
        while(len > 1) {
        	
            for(int i = 0; i <= N - len; i++) {
                for(int j = 0; j <= M - len; j++) {
                    int num = map[i][j];
                    if(num == map[i][j + len - 1] && num == map[i + len - 1][j] && num == map[i + len - 1][j + len - 1]) {
                        System.out.println(len * len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len * len);
	}
}
