import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	private static Integer[][][] dp;
	private static char[] word;
	private static char[] word2;
	private static char[] word3;
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine().toCharArray();
		word2 = br.readLine().toCharArray();
		word3 = br.readLine().toCharArray();		
		
		dp = new Integer[word.length][word2.length][word3.length];

		System.out.println(LCS(word.length - 1, word2.length - 1, word3.length - 1));
		

	}


	private static int LCS(int x, int y, int z) {
		if(x == -1 || y == -1 || z == -1) return 0;
 
		if(dp[x][y][z] == null) {
			dp[x][y][z] = 0;
 
			if(word[x] == word2[y] && word2[y] == word3[z]) dp[x][y][z] = LCS(x - 1, y - 1, z - 1) + 1;
            
			else dp[x][y][z] = Math.max(LCS(x - 1, y, z), Math.max(LCS(x, y - 1, z), LCS(x, y, z - 1)));
		}
		
		return dp[x][y][z];
	}
}