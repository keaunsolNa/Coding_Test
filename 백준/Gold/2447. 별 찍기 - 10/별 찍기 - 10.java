import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static char[][] starArr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		starArr = new char[testCase][testCase];
		
		starMarker(0, 0, testCase, false);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			for(int j = 0; j < testCase; j++) {
				sb.append(starArr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	public static void starMarker(int x, int y, int n, boolean blank) {
		
		if(blank) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					starArr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n == 1) {
			starArr[x][y] = '*';
			return;
		}
		
		int size = n / 3;
		int cnt = 0;
		for(int i = x; i < x + n; i += size) {
			for(int j = y; j < y + n; j += size) {
				cnt++;
				if(cnt == 5) {
					starMarker(i, j, size, true);
				} else {
					starMarker(i, j, size, false);
				}
			}
		}
	}
}
