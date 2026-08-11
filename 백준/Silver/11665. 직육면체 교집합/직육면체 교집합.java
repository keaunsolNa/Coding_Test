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
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int x1 = 0;
		int x2 = 1000;
		int y1 = 0;
		int y2 = 1000;
		int z1 = 0;
		int z2 = 1000;
		
		for (int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			x1 = Math.max(x1, Integer.parseInt(st.nextToken()));
			y1 = Math.max(y1, Integer.parseInt(st.nextToken()));
			z1 = Math.max(z1, Integer.parseInt(st.nextToken()));
			x2 = Math.min(x2, Integer.parseInt(st.nextToken()));
			y2 = Math.min(y2, Integer.parseInt(st.nextToken()));
			z2 = Math.min(z2, Integer.parseInt(st.nextToken()));
			
		}
		
		int x = x2 - x1;
		int y = y2 - y1;
		int z = z2 - z1;
		
		if (x < 0) x = 0;
		
		if (y < 0) y = 0;
		
		if (z < 0) z = 0;
		
		System.out.println(x * y * z);
	}
}
