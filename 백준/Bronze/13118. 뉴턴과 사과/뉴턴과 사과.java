import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int p3 = Integer.parseInt(st.nextToken());
		int p4 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		
		if(p1 == x) {
			System.out.println(1);
		} else if(p2 == x) {
			System.out.println(2);
		} else if(p3 == x) {
			System.out.println(3);
		} else if(p4 == x) {
			System.out.println(4);
		}  else {
			System.out.println(0);
		}
	}
}
