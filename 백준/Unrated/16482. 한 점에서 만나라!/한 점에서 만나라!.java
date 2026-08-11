import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		
		System.out.println((double)(b * (c - d) * (a - e) * 1.0 / (d * e * 1.0 + (c - d) * (a - e) * 1.0)));
		
	}
}
