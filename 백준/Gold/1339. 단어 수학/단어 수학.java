import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] list = new String[N];
		int[] alp = new int[26];
		
		for(int i = 0; i < N; i++) list[i] = br.readLine();
		
		for(int i = 0; i < N; i++) {
			
			int temp = (int)Math.pow(10, list[i].length() - 1);
			
			for(int j = 0; j < list[i].length(); j++) {
				alp[(int)list[i].charAt(j) - 'A'] += temp;
				temp /= 10;
			}
			
		}
		
		Arrays.sort(alp);
		int idx = 9;
		int sum = 0;
		
		for(int i = alp.length - 1; i >= 0; i--) {
			
			if(alp[i] == 0) break;
			
			sum += alp[i]* idx;
			idx--;
			
		}
		
		System.out.println(sum);
   }
}