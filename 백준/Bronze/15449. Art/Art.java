import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			
			for(int j = i + 1; j < 5; j++) {
				
				for(int k = j + 1; k < 5; k++) {
					
					if(arr[i] + arr[j] > arr[k]) {
						
						if((arr[i] + arr[j] + arr[k]) / 2 > 0 )
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
