import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int res = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) 
				res += Integer.parseInt(st.nextToken());
			
            if (res > 0) System.out.println("Right");
            else if (res < 0) System.out.println("Left");
            else System.out.println("Equilibrium");
            
            
		}
		
	}
}
