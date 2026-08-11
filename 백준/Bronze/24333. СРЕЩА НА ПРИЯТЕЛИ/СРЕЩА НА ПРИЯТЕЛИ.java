import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l1 = Integer.parseInt(st.nextToken());
		int r1 = Integer.parseInt(st.nextToken());
		int l2 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int j = l2; j <= r2; j++) {
			if(j != k) {
				
				if(j >= l1 && j <= r1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
