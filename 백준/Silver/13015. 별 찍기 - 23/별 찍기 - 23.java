import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int a = 0; 
		int b = N - 1;
		int c = 3 * N - 3;
		int d = 4 * N - 4;
		
		for (int i = 1; i < 2 * N; ++i) {
			
	        if (i == 1 || i == (2 * N) - 1) {
	        	
	            for (int j = a; j <= b; j++) System.out.print("*");
	            for (int j = b + 1; j < c; j++) System.out.print(" ");
	            for (int j = c; j <= d; j++) System.out.print("*");
	        }
	        
	        else {
	        	
	            for (int j = 0; j < a; j++) System.out.print(" ");
	            System.out.print("*"); 
	            for (int j = a + 1; j < b; j++) System.out.print(" ");
	            System.out.print("*"); 
	            for (int j = b + 1; j < c; j++) System.out.print(" ");
	            if(b != c) System.out.print("*"); 
	            for (int j = c + 1; j < d; j++) System.out.print(" ");
	            System.out.print("*");
	        }
	        System.out.println();
	 
	 
	        if (i < N) {
	            a++; b++; c--; d--;
	        }
	        else {
	            a--; b--; c++; d++;
	        }
	    }
	}

	public static void print(int x) {
		
		System.out.print(x / 12 + "'" + x % 12 + "\"");
	}
}
