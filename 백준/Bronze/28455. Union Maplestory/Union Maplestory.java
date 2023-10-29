import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[N];
		
		for(int i = 0; i < N ; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Collections.reverseOrder());
		int hab = 0;
		int total = 0;
		
		N = N < 42 ? N : 42;
		
		for(int i = 0; i < N; i++) {
			total += arr[i];
			hab += arr[i] >= 250 ? 5 : arr[i] >= 200 ? 4 : arr[i] >= 140 ? 3 : arr[i] >= 100 ? 2 : arr[i] >= 60 ? 1 : 0; 
		}


		System.out.println(total);
		System.out.println(hab);
   }
}