import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10];
		
		int sum = 0;
		int prevSum = 0;
		for(int i = 0; i < 10; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			prevSum = sum;
			sum += temp;
			
			if(sum >= 100) break;
		}
		
		if(Math.abs(prevSum - 100) == Math.abs(sum - 100)) {
			System.out.println(Math.max(sum, prevSum));
		} else {
			if(Math.abs(prevSum - 100) > Math.abs(sum - 100)) System.out.println(sum);
			else System.out.println(prevSum);
		}
		
	}
}
