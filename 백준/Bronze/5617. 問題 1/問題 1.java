import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String input = "";
		int T = 0;
		int RT = 0;
		int AT = 0;
		int OT = 0;

		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			int[] arr= new int[3];
			for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			if(arr[0] + arr[1] <= arr[2]) {
				
				break; 
				
			} else {
				
				T++;				
				int ab = arr[0] * arr[0]  + arr[1] * arr[1];
				int c = arr[2] * arr[2];
				
				if(ab == c) RT++;
				else if(ab > c) AT++;
				else if(ab < c) OT++;
				
			}
		}
		
		System.out.println(T + " " + RT + " " + AT + " " + OT);
		
	}
}
