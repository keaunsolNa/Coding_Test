import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static BigInteger[] dp;

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		dp = new BigInteger[1001];
		dp[1] = new BigInteger("1");
		dp[2] = new BigInteger("2");
		
		
		while(!(input = br.readLine()).equals("0 0")) {
			st = new StringTokenizer(input, " ");
			
			String a = st.nextToken();
			String b = st.nextToken();
			int chk = 0;
			int i = 3;
			while(true) {
				
				dp[i] = dp[i-1].add(dp[i-2]);
				if(dp[i].compareTo(new BigInteger(a)) == 0 || dp[i].compareTo(new BigInteger(a)) > 0) {
					chk++;
				}
				
				if(dp[i].compareTo(new BigInteger(b)) > 0) {
					chk--;
					break;
				}
				i++;
			}
			
			if(a.equals("0") && b.equals("2")) {
				System.out.println(2);
			} else if(new BigInteger(a).compareTo(new BigInteger(b)) > 0) {
				System.out.println(0);
			} else {
				System.out.println(chk);
			}
		}
		
			
	}
}
