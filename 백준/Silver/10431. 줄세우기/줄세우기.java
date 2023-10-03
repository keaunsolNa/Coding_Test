import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int P = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < P; i++) {

			st = new StringTokenizer(br.readLine());
			
			int no = Integer.parseInt(st.nextToken());
			int result = 0;
			Integer[] arr = new Integer[20];
			
			for(int j = 0; j < 20; j++) arr[j] = Integer.parseInt(st.nextToken());
			
			for(int j = 1; j < 20; j++) for(int k = j - 1; k >= 0; k--) if(arr[k] > arr[j]) result++;
			
			System.out.println(no + " " + result);
		}
	}
}
