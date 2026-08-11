import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		String[] input = new String[N];
		for(int i = 0; i < N; i++) input[i] = br.readLine();
		
		Arrays.sort(input, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() != o2.length()) {
					return o1.length() - o2.length();
				} else {
					
					int sum1 = 0;
					int sum2 = 0;

					String temp = o1.replaceAll("[^0-9]", "");
					String temp2 = o2.replaceAll("[^0-9]", "");
					
					for(int i = 0; i < temp.length(); i++) sum1 += Character.getNumericValue(temp.charAt(i));
					for(int i = 0; i < temp2.length(); i++) sum2 += Character.getNumericValue(temp2.charAt(i));
					
					if(sum1 != sum2) return sum1 - sum2;
					
					else return o1.compareTo(o2);
						
				}
			}
 
		});
		
		for (String string : input) sb.append(string + "\n");
		System.out.println(sb);
		
	}
}
