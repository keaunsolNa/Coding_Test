import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[1000001];
		arr[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			int sqrtNum = (int)Math.floor(i - Math.sqrt(i));
			int logNum = (int)Math.log(i);
			int sinNum = (int)(i * Math.sin(i) * Math.sin(i));
			
			arr[i] = (arr[sqrtNum] + arr[logNum] + arr[sinNum]) % 1000000;
		}
		
		while(true) {

			int x = Integer.parseInt(br.readLine());
			
			if(x == -1) break;
			System.out.println(arr[x]);
		}
	}
}
