import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] map = new char[N + 2][N + 2];
		for(int i = 1; i < N + 1; i++) {
			String input = br.readLine();
			
			for(int j = 1; j < N + 1; j++) {
				map[i][j] = input.charAt(j - 1);
			}
		}
		
		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N; j++) {
				
				if(map[i][j] != '.' ) sb.append("*");
				
				else if(map[i][j] == '.'){
					int cnt = 0;
					
					cnt += (Character.getNumericValue(map[i - 1][j]) == -1 ) ? 0 : Character.getNumericValue(map[i - 1][j]);
					cnt += (Character.getNumericValue(map[i][j - 1]) == -1) ? 0 : Character.getNumericValue(map[i][j - 1]);
					cnt += (Character.getNumericValue(map[i - 1][j - 1]) == -1) ? 0 : Character.getNumericValue(map[i - 1][j - 1]);
					cnt += (Character.getNumericValue(map[i + 1][j]) == -1) ? 0 : Character.getNumericValue(map[i + 1][j]);
					cnt += (Character.getNumericValue(map[i][j + 1]) == -1) ? 0 : Character.getNumericValue(map[i][j + 1]);
					cnt += (Character.getNumericValue(map[i - 1][j + 1]) == - 1) ? 0 : Character.getNumericValue(map[i - 1][j + 1]);
					cnt += (Character.getNumericValue(map[i + 1][j + 1]) == - 1) ? 0 : Character.getNumericValue(map[i + 1][j + 1]);
					cnt += (Character.getNumericValue(map[i + 1][j - 1]) == - 1) ? 0 : Character.getNumericValue(map[i + 1][j - 1]);
					if(cnt >= 10) sb.append("M");
					else sb.append(cnt);
				}
				
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
