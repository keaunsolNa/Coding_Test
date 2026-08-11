import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[101][101];
		
		for (int i = 0; i < 4; i++) {
			
			String[] str = br.readLine().split(" ");
			int lx = Integer.parseInt(str[0]);
			int ly = Integer.parseInt(str[1]);
			int rp = Integer.parseInt(str[2]);
			int rq = Integer.parseInt(str[3]);
 
			for (int j = ly; j < rq; j++) 
				for (int k = lx; k < rp; k++) 
					arr[j][k] = 1; 
			
		}
		
		int cnt = 0;
		
		for (int i = 1; i <= 100; i++) 
			for (int j = 1; j <= 100; j++) 
				if (arr[i][j] == 1) cnt++;
		
		System.out.println(cnt);
		
	}
}
