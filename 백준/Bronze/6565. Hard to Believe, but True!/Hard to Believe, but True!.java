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
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String input = br.readLine();
			if(input.equals("0+0=0")) {
				sb.append("True");
				break;
			}
			
			String[] temp = input.split("\\+|=");
			
			String leftStr = new StringBuilder(temp[0]+"").reverse().toString();
			String rightStr = new StringBuilder(temp[1]+"").reverse().toString();
			String answerStr = new StringBuilder(temp[2]+"").reverse().toString();
			
			int left = Integer.parseInt(leftStr);
			int right = Integer.parseInt(rightStr);
			int answer = Integer.parseInt(answerStr);
			
			if(left + right == answer) sb.append("True");
			else sb.append("False");
			sb.append("\n");
			
		}
		
		System.out.println(sb);
	}
}
