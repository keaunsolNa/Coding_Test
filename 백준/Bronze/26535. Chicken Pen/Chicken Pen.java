import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int chicken = (int)Math.ceil(Math.sqrt(Integer.parseInt(br.readLine())));
		for(int i = 0; i < chicken + 2; i++) sb.append("x");
		
		
		sb.append("\n");
		
		for(int o = 0; o < chicken; o++) {
			
			for(int i = 0; i < chicken + 2; i++) {
				
				if(i == 0 || i == chicken + 1) sb.append("x");
				else sb.append(".");
			}
			
			sb.append("\n");
			
		}
		
		for(int i = 0; i < chicken + 2; i++) sb.append("x");
		
		System.out.println(sb);
		
	}
}
