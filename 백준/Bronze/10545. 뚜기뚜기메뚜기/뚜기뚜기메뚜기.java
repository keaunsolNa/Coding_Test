import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] alp = { 2, 22, 222, 3, 33, 333, 4, 44, 444, 5, 55, 555, 6, 66, 666, 7, 77, 777, 7777, 8, 88, 888, 9, 99, 999, 9999 };
		int[] num = new int[10];
		int prev = -1;
		
		for(int i = 1; i < 10; i++) num[Integer.parseInt(st.nextToken())] = i;
		
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i++) {
			
			int temp = alp[input.charAt(i) - 'a'];
			if(prev == temp % 10) sb.append("#");
			
			while(temp != 0) {
				
				sb.append(num[temp % 10]);
				prev = temp % 10;
				temp /= 10;
			}
		}
		
		System.out.println(sb);
   }
}