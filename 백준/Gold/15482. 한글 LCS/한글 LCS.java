import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	private static Integer[][] dp;
	private static char[] word;
	private static char[] word2;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine().toCharArray();
		word2 = br.readLine().toCharArray();
		
		dp = new Integer[word.length][word2.length];

		System.out.println(lcs(word.length - 1, word2.length - 1));
		
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
}
