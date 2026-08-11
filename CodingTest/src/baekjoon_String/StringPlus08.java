package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPlus08 {
	
	public static void main(String[] args) throws IOException {
		test07();
	}
	

	// 더하기
	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = br.readLine().split(",");
		
		long sum = 0;
		for(int i = 0; i < strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		
		System.out.println(sum);
	}
	
	
}
