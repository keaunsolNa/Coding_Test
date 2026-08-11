import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static char[][] star;

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        n = 4 * n - 3;
        star = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ' ';
            }
        }

        solve(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }

    public static void solve(int s, int len) {
        if (len<=s) return;

        for (int i = s; i < len; i++) {
            star[s][i] = '*'; 
            star[len - 1][i] = '*'; 
            star[i][s] = '*';
            star[i][len - 1] = '*'; 
        }


        solve(s + 2, len - 2);
    }
}
