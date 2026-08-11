import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	private static int n;
	private static Integer[] number;
	private static Integer[] dp2;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		number = new Integer[n + 1];
		dp2 = new Integer[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= n; i++) number[i] = Integer.parseInt(st.nextToken());
	
		dp2[1] = number[1];
		
		for(int i = 2; i <= n; i++) { 
			
			dp2[i] = number[i]; 
			
			for(int j = 1; j < i; j++) 
				if(number[i] > number[j]) dp2[i] = Math.max(dp2[j] + number[i], dp2[i]); 
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) 
			if(dp2[i] > max) max = dp2[i];
		
		
		System.out.println(max);
	}
}
