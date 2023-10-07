import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] arr = new int[27];
		for(int i = 0; i < str.length(); i++) arr[(int)str.charAt(i) - 'A']++;
		int cnt = 0;
		
		while(true) {
			
			if(arr[1] > 0 && arr[4] > 1 && arr[8] > 0 && arr[11] > 0 && arr[13] > 0 && arr[14] > 0 
					  && arr[17] > 1 && arr[18] > 0 && arr[21] > 0 && arr[25] > 0) {
				
				arr[1]--; arr[4] -= 2; arr[8]--; arr[11]--; arr[14] --; arr[17] -= 2; arr[18]--; arr[21]--; arr[25]--;
				cnt++;
			}
			else break;
		}
		
		System.out.println(cnt);
	}
}
