import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int numbers[];
	private static int operator[];
	private static int MAX = -1000000000;
	private static int MIN = 1000000000;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		numbers = new int[N];
		operator = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		operatorDfs(numbers[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}

	public static void operatorDfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			
			if(operator[i] > 0) {
				
				operator[i]--;
				
				switch(i) {
				
				case 0 : operatorDfs(num + numbers[idx], idx +1); break;
				case 1 : operatorDfs(num - numbers[idx], idx +1); break;
				case 2 : operatorDfs(num * numbers[idx], idx +1); break;
				case 3 : operatorDfs(num / numbers[idx], idx +1); break;
				
				}
				
				operator[i]++;
			}
		}
	}
}
