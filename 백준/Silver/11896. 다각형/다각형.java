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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		if (a <= 2) a = 3;
		if (a % 2 == 1) a++;
		if (b % 2 == 1) b--;
		a /= 2;
		b /= 2;
		
		if (a > b) System.out.println(0);
        else System.out.println((b * (b + 1) - a * (a - 1)));
		
	}
}
