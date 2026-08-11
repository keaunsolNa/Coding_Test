import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("0 0")) {
			
			st = new StringTokenizer(input);
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			boolean[][] arr = new boolean[D][N];
			
			for(int i = 0; i < D; i++) {
				
				st = new StringTokenizer(br.readLine());
				
				for(int j = 0; j < N; j++) {
					arr[i][j] = (Integer.parseInt(st.nextToken()) == 1) ? true : false;
				}
			}
			
			if(chk(arr, N, D)) System.out.println("yes");
			else System.out.println("no");
			
		}
		
	}

	private static boolean chk(boolean[][] arr, int N, int D) {
		
		for(int i = 0; i < N; i++) {
			boolean chk = true;
			
			for(int j = 0; j < D; j++) {
				if(!arr[j][i]) chk = false;
			}
			
			if(chk) return true;
		}
		
		return false;
		
	}
}
