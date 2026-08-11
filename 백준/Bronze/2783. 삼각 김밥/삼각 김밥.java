import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		double X = Integer.parseInt(st.nextToken());
		double Y = Integer.parseInt(st.nextToken());
		double price = 1000/Y * X;
		double min = price;

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			double X1 = Integer.parseInt(st.nextToken());
			double Y1 = Integer.parseInt(st.nextToken());
			
			double price2 = 1000/Y1 * X1;
			if(price2 < min) {
				min = price2;
			}
			
		}
		
		System.out.println(Math.round(min * 100)/100.0);
		
	}
}
