import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	private static int max;
	private static Integer[][] dp7;
	private static char[] word;
	private static char[] word2;

	public static void main(String[] args) throws IOException {
		test15();
	}

	public static void test15() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		word = br.readLine().toCharArray();
		word2 = br.readLine().toCharArray();
		
		dp7 = new Integer[word.length][word2.length];

		System.out.println(lcs(word.length - 1, word2.length - 1));
		
	}

	private static int lcs(int x, int y) {
		if(x == -1 || y == -1) return 0;
 
		if(dp7[x][y] == null) {
			dp7[x][y] = 0;
 
			if(word[x] == word2[y]) dp7[x][y] = lcs(x - 1, y - 1) + 1;
 
			else dp7[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
		}
		
		return dp7[x][y];
	}
}
