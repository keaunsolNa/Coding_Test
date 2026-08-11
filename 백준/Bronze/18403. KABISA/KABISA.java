import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String[] input = br.readLine().replaceAll(" ", "").split("\\,");
			
			for(int i = 0; i < input.length; i++) 
				if(isLeapYear(Integer.parseInt(input[i]))) sb.append(input[i] + " ");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static boolean isLeapYear(int year) {
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
		
		return false;
	}
}
