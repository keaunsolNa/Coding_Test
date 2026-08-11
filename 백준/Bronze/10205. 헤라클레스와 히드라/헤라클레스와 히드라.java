import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			int head = Integer.parseInt(br.readLine());
			String doing = br.readLine();
			
			for(int j = 0; j < doing.length(); j++) {
				if(doing.charAt(j) == 'c') {
					head++;
				} else {
					head--;
				}
			}
			System.out.println("Data Set " + (i+1) + ":");
			System.out.println(head);
			System.out.println();
		}
	}
}
