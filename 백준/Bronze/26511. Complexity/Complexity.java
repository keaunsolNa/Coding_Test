import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			
			int[] arr = new int[26];
			String str = br.readLine();

			for(int j = 0; j < str.length(); j++) arr[str.charAt(j) - 'a']++;
			
			Arrays.sort(arr);
			
			int ans = 0;
			for(int j = 23; j >= 0; j--) ans += arr[j];
			System.out.println(ans);
		}
	}

}
