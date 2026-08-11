import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("# 0 0")) {
			String[] arr = input.split(" ");
			String name = arr[0];
			int age = Integer.parseInt(arr[1]);
			int kg = Integer.parseInt(arr[2]);
			
			if(age > 17 || kg >= 80 ) {
				System.out.println(name + " Senior");
			} else {
				System.out.println(name + " Junior");
			}
		}
	}
}
