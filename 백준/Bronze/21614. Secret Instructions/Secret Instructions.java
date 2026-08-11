import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		String dir = "";
		
		while(!(input = br.readLine()).equals("99999")) {
			
			int direction = (Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(1)));
			int length = Integer.parseInt(input.substring(2));
			
			if(direction == 0) dir = dir;
			else if(direction % 2 == 0) dir = "right ";
			else if(direction % 2 != 0) dir = "left ";
			
			sb.append(dir + length + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
