import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[T];
		for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int[] clone = arr.clone();
		
		Arrays.sort(clone);
		
		for(int i = 0; i < T; i++) {
			
			for(int j = 0; j < T; j++) {
				if(arr[i] == clone[j]) {
					System.out.println(j + 1);
					break;
				}
				
			}
		}
	}
}
