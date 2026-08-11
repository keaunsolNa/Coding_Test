import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int aSum = 0;
		aSum += Integer.parseInt(st.nextToken())*6;
		aSum += Integer.parseInt(st.nextToken())*3;
		aSum += Integer.parseInt(st.nextToken())*2;
		aSum += Integer.parseInt(st.nextToken())*1;
		aSum += Integer.parseInt(st.nextToken())*2;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int bSum = 0;
		bSum += Integer.parseInt(st.nextToken())*6;
		bSum += Integer.parseInt(st.nextToken())*3;
		bSum += Integer.parseInt(st.nextToken())*2;
		bSum += Integer.parseInt(st.nextToken())*1;
		bSum += Integer.parseInt(st.nextToken())*2;
		
		System.out.println(aSum + " " + bSum);
	}
}
