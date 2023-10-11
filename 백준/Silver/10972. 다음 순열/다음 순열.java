import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
	
		int i = arr.length - 1;
		while(i > 0 && arr[i - 1] >= arr[i]) i--;
			
       if(i <= 0) { System.out.println(-1); return; }
		
		int j = arr.length - 1;
		
		while(arr[i - 1] >= arr[j]) j -= 1;
		
		int temp = arr[j];
		arr[j] = arr[i - 1];
		arr[i - 1] = temp;
		j = arr.length - 1;
		
		while(i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i += 1;
			j -= 1;
		}
		
		for (int k : arr) System.out.print(k + " ");
   }
}