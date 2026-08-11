import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char[][] map = new char[N][N];
		for(int i = 0; i < N; i++) map[i] = br.readLine().toCharArray();
		
		for(int i = 0; i < N; i++) {

			String line = "";
			for(int j = 0; j < N; j++) {
				line += map[i][j];
			}
			
			String line2 = "";
			for(int j = 0; j < N; j++) {
				line2 += map[j][i];
			}
			
			if(!line.equals(line2)) {
				System.out.println("NO");
				return;
			}

		}
		
		System.out.println("YES");
		
	}
}
