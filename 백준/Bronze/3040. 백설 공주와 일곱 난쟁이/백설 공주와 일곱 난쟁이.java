import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int numbers[];

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		numbers = new int[7];
		dfsInt(0, 0, arr);
	}

	public static void dfsInt(int cnt, int depth, int[] arr) {
		if(cnt == 7) {
			int sum = 0;
			for (int i : numbers) {
				sum += i;
			}
			if(sum == 100) {
				for (int i : numbers) {
					System.out.println(i);
				}
				return;
			}
			return;
		} 
		
		for(int i =  depth; i < 9; i++) {
			numbers[cnt] = arr[i];
			dfsInt(cnt+1, i+ 1, arr);
		}
		
	}
}
