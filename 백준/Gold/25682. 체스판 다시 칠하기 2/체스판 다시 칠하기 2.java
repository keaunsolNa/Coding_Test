import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int M;
	private static int K;
	private static char[][] board;

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		board = new char[N ][M];
		
		for(int i = 0; i < N; i++) {
			
			String line = br.readLine();
			for(int j = 0; j < M; j++) 
				board[i][j] = line.charAt(j);
		}
		
        int[][] prefixSumB = ps('B');
        int[][] prefixSumW = ps('W');
	
        System.out.println(Math.min(calculate(prefixSumB), calculate(prefixSumW)));
        
	}

    private static int[][] ps(char st) {
    	
        int[][] temp = new int[N + 1][M + 1];
        
        for (int i = 0; i < N; i++) {
        	
            for (int j = 0; j < M; j++) {
                int curr = ((i + j) % 2 == 0) ? board[i][j] == st ? 0 : 1 : board[i][j] == st ? 1 : 0;
                temp[i + 1][j + 1] = temp[i + 1][j] + temp[i][j + 1] - temp[i][j] + curr;
            }
        }
        
        return temp;
    }

    private static int calculate(int[][] ps) {
    	
        int cnt = (int) 1e9;
        for (int i = 1; i <= N - K + 1; i++) {
        	
            for (int j = 1; j <= M - K + 1; j++) {
            	
                int num = ps[i + K - 1][j + K - 1] 
                		- ps[i + K - 1][j - 1] 
        				- ps[i - 1][j + K - 1] 
						+ ps[i - 1][j - 1];
                
                cnt = Math.min(cnt, num);
            }
        }
        
        return cnt;
    }
}
