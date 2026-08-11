import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = 0;
		BigInteger [] arr = new BigInteger[500];
		
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		
		for(int i = 2; i <= 490; i++) {
			arr[i] = arr[i-2].add(arr[i-1]);
		}
		
		while((n=Integer.parseInt(br.readLine()))!=-1) {
			bw.write("Hour "+n+": "+arr[n]+" cow(s) affected\n");
		}
		
		bw.close();
	}
}
