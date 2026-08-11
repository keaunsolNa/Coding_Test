import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] start = br.readLine().split(" : ");
		String[] end = br.readLine().split(" : ");
		
		int startSecond = Integer.parseInt(start[2]) + (Integer.parseInt(start[1])*60) + (Integer.parseInt(start[0])*3600);
		int endSecond = Integer.parseInt(end[2]) + (Integer.parseInt(end[1])*60) + (Integer.parseInt(end[0])*3600);
		
		if(endSecond - startSecond >= 0) {
			System.out.println(endSecond - startSecond);
		} else {
			System.out.println(86400 - startSecond + endSecond);
		}
	}
}
