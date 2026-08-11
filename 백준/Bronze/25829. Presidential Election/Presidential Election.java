import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int totalE1 = 0;
		int totalE2 = 0;
		int totalV1 = 0;
		int totalV2 = 0;
		
		while(N -- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int e = Integer.parseInt(st.nextToken());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			
			if(v1 < v2) {
				totalV1 += v1;
				totalV2 += v2;
				totalE2 += e;
			} else if(v1 > v2) {
				totalV1 += v1;
				totalV2 += v2;
				totalE1 += e;
			}
		}

		if(totalV1 > totalV2 && totalE1 > totalE2) System.out.println(1);
		else if(totalV1 < totalV2 && totalE1 < totalE2) System.out.println(2);
		else System.out.println(0);
	}
}
