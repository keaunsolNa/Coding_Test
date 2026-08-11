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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[T];
		
		for(int i = 0; i < 2 * T - 1; i++) {
			int a = Integer.parseInt(st.nextToken()) - 1;
			
			if(arr[a]) arr[a] = false;
			else arr[a] = true;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == true) {
				System.out.println(i + 1);
				break;
			}
		}
		
	}
}
