import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		StringBuilder sb = new StringBuilder();
		
		while((input = br.readLine()) != null) {
			sb.append(input);
		}
		String[] arr = sb.toString().split(",");
		
		BigInteger total = new BigInteger("0");
		for(int i = 0; i < arr.length; i++) {
			BigInteger number = new BigInteger(arr[i]);
			total = total.add(number);
		}
		
		System.out.println(total);
	}
}
