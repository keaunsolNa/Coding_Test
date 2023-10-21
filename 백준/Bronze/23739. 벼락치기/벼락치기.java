import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int min = 30;
		int temp = N;
		
		int[] arr = new int[N]; 
		int[] arrOrigin = new int[N];
		for(int i = 0; i < N; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			arrOrigin[i] = arr[i];
		}
		
		
		int index = 0;
		while(N != 0) {
			
			arr[index]--;
			min--;
			
			if(min == 0 ) { min = 30; index++; N--; }
			else if(arr[index] == 0) { index++; N--; }
			
			
		}
		
		int answer = 0;
		for(int i = 0; i < temp; i++) 
			if(arr[i] * 2 - 1 < arrOrigin[i]) answer++;

		System.out.println(answer);
	}
}
