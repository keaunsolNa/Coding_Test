import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] price = new Integer[N];
		
		for(int i = 0; i < N; i++) price[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(price, Collections.reverseOrder());
		
		long totalPrice = 0;
		for(int i = 0; i < N; i++) {
			
			if((i + 1) % 3 != 0) totalPrice += price[i];
			
		}
		
		System.out.println(totalPrice);
	}
}
