import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		
		long aSum = 0;
		long bSum = 0;
		
		for(int i = 0; i < A.length(); i++) {
			aSum += Character.getNumericValue(A.charAt(i));
		}
		aSum *= A.length();
		
		for(int i = 0; i < B.length(); i++) {
			bSum += Character.getNumericValue(B.charAt(i));
		}
		bSum *= B.length();
		
		if(aSum > bSum) {
			System.out.println(1);
		} else if(aSum < bSum) {
			System.out.println(2);
		} else {
			System.out.println(0);
		}
	}
}
