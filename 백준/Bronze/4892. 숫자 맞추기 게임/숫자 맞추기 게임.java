import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long input = -1;
		long index = 1;
		while((input = Integer.parseInt(br.readLine())) != 0) {
			long n = input;
			String evenOrOdd ="";
			
			if(n%2 == 0) {
				evenOrOdd = "even";
				n = (((n * 3) / 2) * 3) / 9;
			} else {
				evenOrOdd = "odd";
				n = ((((n * 3) + 1) / 2) * 3) / 9;
			}
			
			sb.append(index).append(". ").append(evenOrOdd).append(" ").append(n).append("\n");
		
			index++;
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		System.out.println(sb);
		
	}
}
