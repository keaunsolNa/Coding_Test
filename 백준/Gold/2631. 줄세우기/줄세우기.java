import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] lts = new int[n];
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(br.readLine());
		
		lts[0] = arr[0];
		int length = 1;
		
		for(int i = 1; i < n; i++) {
			
			int search = arr[i];
			
			if(lts[length - 1] < search) {
				
				length++;
				lts[length - 1] = search;
			}
			
			else {
				
				int first = 0;
				int last = length;
				
				while(first < last) {
					
					int mid = (first + last) / 2;
					
					if(lts[mid] < search) first = mid + 1;
					else last = mid;
				}
				
				lts[first] = search;
			}
		}
		
		System.out.println(n - length);
	
	}
}
