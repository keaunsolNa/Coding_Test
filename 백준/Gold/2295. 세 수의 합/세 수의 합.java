import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		while(N --> 0) arr[N] = Integer.parseInt(br.readLine());
		
		int[] sum = new int[(arr.length * (arr.length + 1)) / 2];
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) 
			for(int j = i; j < arr.length; j++) sum[cnt++] = arr[i] + arr[j];

		Arrays.sort(sum);
		
		int answer = -1;
		for(int i = 0; i < arr.length; i++) 
			for(int j = 0; j < arr.length; j++) 
				if(binary(sum, arr[i] - arr[j])) answer = Math.max(answer, arr[i]);
		
		
		System.out.println(answer);
   
    }
    
    private static boolean binary(int[] arr, int value) {
		
        int L = 0;
        int R = arr.length - 1;
		
		while(L <= R) {
			
			int M = (L + R) / 2;
			
			if(arr[M] > value) R = M - 1;
			else if(arr[M] < value) L = M + 1;
			else return true;
			
		}
		
		return false;
    }
    
}