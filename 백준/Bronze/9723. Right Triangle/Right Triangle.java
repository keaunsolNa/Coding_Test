import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine());
			double[] arr = new double[3];
			
			for(int j = 0; j < 3; j++) arr[j] = Double.parseDouble(st.nextToken());
			
			Arrays.sort(arr);
			
			
			sb.append("Case #" + i + ": ");
			if((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) sb.append("YES");
			else sb.append("NO");
				
			sb.append("\n");
					
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
