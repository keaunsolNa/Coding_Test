import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int y = 0;
			int k = 0;
			for(int i = 0; i < 9; i++) {
				
				String input = br.readLine();
				
				y += Integer.parseInt(input.split(" ")[0]);
				k += Integer.parseInt(input.split(" ")[1]);
			}
			
			if(y > k) {
				System.out.println("Yonsei");
			} else if(y < k) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}
			
		}
	}
}
