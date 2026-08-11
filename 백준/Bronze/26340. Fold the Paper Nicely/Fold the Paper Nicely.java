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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		boolean left = true;
		for(int i = 0 ; i < T; i++) {
			sb.append("Data set: ");
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int cnt = Integer.parseInt(st.nextToken());
			sb.append(x + " " + y + " " + cnt).append("\n");
			for(int j = 0; j < cnt; j++) {
				if(x > y) {
					x = x/2;
					left = false;
				} else if(y > x) {
					y = y/2;
					left = true;
				} else if(y == x) {
					if(left) {
						y = y/2;
					} else {
						x = x/2;
					}
				}
				
				if(x == 0 && y == 0) break;
			}
			
			if(x > y) {
				sb.append(x + " " + y).append("\n").append("\n");
			} else {
				sb.append(y + " " + x).append("\n").append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
