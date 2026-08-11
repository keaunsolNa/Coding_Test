import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String A = br.readLine();
		String B = br.readLine();
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) == '1' && B.charAt(i) == '1') sb.append(1);
			else sb.append(0);
			
		}
		
		sb.append("\n");
		
		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) == '1' || B.charAt(i) == '1') sb.append(1);
			else sb.append(0);
			
		}
		
		sb.append("\n");
		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) == '1' && B.charAt(i) == '1') sb.append(0);
			else if(A.charAt(i) == '1' || B.charAt(i) == '1') sb.append(1);
			else sb.append(0);
			
		}
		
		sb.append("\n");
		for(int i = 0; i < A.length(); i++) {
			
			if(A.charAt(i) == '1') sb.append(0);
			else sb.append(1);
			
		}
		
		sb.append("\n");
		for(int i = 0; i < A.length(); i++) {
			
			if(B.charAt(i) == '1') sb.append(0);
			else sb.append(1);
			
		}
		
		
		System.out.println(sb);
	}
}
