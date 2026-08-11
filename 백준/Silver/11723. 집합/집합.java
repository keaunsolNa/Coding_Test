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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int bit = 0;
		
		while(N --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int number;
			switch(order) {
				case "add" : 
					number = Integer.parseInt(st.nextToken());
                    bit |= (1 << (number - 1));
					break;
				case "remove" : 
					number = Integer.parseInt(st.nextToken());
					bit = bit & ~(1 << (number - 1));
					break;
				case "check" : 
					number = Integer.parseInt(st.nextToken());
                    sb.append((bit & (1 << (number - 1))) != 0 ? "1\n" : "0\n");
					break;
				case "toggle" : 
					number = Integer.parseInt(st.nextToken());
					bit ^= (1 << (number - 1));
					break;
				case "all" : 
					bit |= (~0);
                    break;
				case "empty" : 
					bit &= 0;
					break;
			}
			
		}
		
		System.out.println(sb);
	}
}
