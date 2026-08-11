import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Denominations: ");
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			
			for(int j = 0; j < arr.length; j++) {
				String input = st.nextToken();
				arr[j] = Integer.parseInt(input);
				
				if(j < arr.length-1) {
					sb.append(input + " ");
				} else {
					sb.append(input);
				}
			}
			
			sb.append("\n");
			
			Arrays.sort(arr);
			boolean chk = true;
			for(int j = 0; j < arr.length - 1; j++) {
				
				if(arr[j]*2 > arr[j+1]) {
					chk = false;
					break;
				}
			}
			
			if(chk) {
				sb.append("Good coin denominations!");
			} else {
				sb.append("Bad coin denominations!");
			}
			
			sb.append("\n");
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb.deleteCharAt(sb.length()-1));
	}
}
