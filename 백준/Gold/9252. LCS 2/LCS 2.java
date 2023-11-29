import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static Integer[][] dp;
	private static char[] word;
	private static char[] word2;
	private static StringBuilder sb = new StringBuilder();

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        word = br.readLine().toCharArray();
        word2 = br.readLine().toCharArray();

        dp = new Integer[word.length][word2.length];
        
        System.out.println(lcs(word.length - 1, word2.length - 1));
        getLCSToString(word.length - 1, word2.length - 1);
        System.out.println(sb.reverse().toString());
	}
	
	private static int lcs(int x, int y) {
		
		if(x == -1 || y == -1) return 0;
		
		if(dp[x][y] == null) {
			
			dp[x][y] = 0;
			
			if(word[x] == word2[y]) dp[x][y] = lcs(x - 1, y - 1) + 1;
			else dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
			
		}
		
		return dp[x][y];
	}
	
	private static void getLCSToString(int x, int y) {
		
		if(x == -1 || y == -1) return;
		
		if(x < word.length && y < word2.length && word[x] == word2[y]) {
			
			sb.append(word[x]);
			getLCSToString(x - 1, y - 1);
			
		} else {
			
			if (x > 0 && (y == 0 || dp[x - 1][y] >= dp[x][y - 1])) getLCSToString(x - 1, y);
			else if (y > 0) getLCSToString(x, y - 1);
			
		}
	}
}