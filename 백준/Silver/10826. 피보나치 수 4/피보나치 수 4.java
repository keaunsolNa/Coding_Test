import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(fibonacci2(n));
	}
    
	public static String fibonacci2(int n) {
		BigInteger f0 = new BigInteger("0");
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		if(n < 2)return n+"";
		for(int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1.add(f0);
		}
		return f2.toString();
	}
}