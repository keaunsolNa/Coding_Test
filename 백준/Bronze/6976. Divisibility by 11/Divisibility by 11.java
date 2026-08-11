import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		while(T --> 0) {
			
			StringBuilder sb = new StringBuilder(br.readLine());
			String firstNumber = sb.toString();
			BigInteger ten = new BigInteger("10");
			
			ans.append(sb + "\n");
			while(sb.length() > 2) {
				BigInteger num1 = new BigInteger(sb.toString());
				BigInteger mod = num1.mod(ten);
				num1 = num1.divide(ten);
				num1 = num1.subtract(mod);
				sb.setLength(0);
				sb.append(num1);
				ans.append(sb + "\n");
			}
			
			if(Integer.parseInt(sb.toString()) % 11 == 0) {
				ans.append("The number " + firstNumber +" is divisible by 11.\n");
			} else {
				ans.append("The number " + firstNumber +" is not divisible by 11.\n");
			}
			ans.append("\n");
		}
		
		ans.deleteCharAt(ans.length() - 1);
		System.out.print(ans);
	}
}
