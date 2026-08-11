import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int ans = 0;
		for(int i = 1; i <= a; i++) {
			
			for(int j = 1; j <= b; j++) {
				
				if(i + j == 10) ans++;
			}
		}
		
		if(ans == 1) System.out.println("There is 1 way to get the sum 10."); 
		else if(ans > 1) System.out.println("There are " + ans +" ways to get the sum 10.");
			
	}
}
