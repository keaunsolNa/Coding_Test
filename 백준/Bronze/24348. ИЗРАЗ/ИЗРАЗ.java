import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[3];
		arr[0] = Long.parseLong(st.nextToken());
		arr[1] = Long.parseLong(st.nextToken());
		arr[2] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);

		if(arr[1] == 0) System.out.println(arr[2]);
		else System.out.println(arr[1] * arr[2] + arr[0]);
		
	}
}
