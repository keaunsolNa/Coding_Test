import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static int[][] bingo;

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		bingo = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) 
				bingo[i][j] = sc.nextInt();
		}

		
		for(int i = 1; i <= 25; i++) {
			int num = sc.nextInt();
			for(int j = 0; j < 5; j++) {
				
				for(int k = 0; k < 5; k++) {
					
					if(bingo[j][k] == num) bingo[j][k] = 0;
					
					if (check(j, k) >= 3) {
						System.out.println(i);
						return;
					}
				}
				
			}
		}
		
	}

	private static int check(int r, int c) {

		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			int rcnt = 0;
			
			for (int j = 0; j < 5; j++) 
				if (bingo[i][j] == 0) rcnt++;
			
			if (rcnt == 5) cnt++;
			
		}

		for (int i = 0; i < 5; i++) {
			int cnt2 = 0;
			
			for (int j = 0; j < 5; j++) 
				if (bingo[j][i] == 0) cnt2++;
			
			if (cnt2 == 5) cnt++;
			
		}

		int cnt2 = 0;
		for (int i = 4; i >= 0; i--) {

			if (bingo[4-i][i] == 0) cnt2++;
			if (cnt2 == 5) cnt++;
			
		}

		cnt2 = 0;
		for (int i = 0; i < 5; i++) {
			if ( bingo[i][i] == 0) cnt2++;
			if (cnt2 == 5) cnt ++;
		}
		
		return cnt;
	}
}
