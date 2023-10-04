import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int arr[] = new int[testCase];
		for(int i = 0; i < testCase; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gcdVal = arr[1] - arr[0];
		
		for(int i = 2; i < testCase; i++) {
			gcdVal = gcd(gcdVal, arr[i] - arr[i-1]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i <= gcdVal; i++) {
			
			if(gcdVal % i == 0) {
				sb.append(i).append(" ");
			}
		}
		
		System.out.println(sb);
	}
    
    public static int gcd(int a, int b) {
		while(b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		
		return a;
	}
}