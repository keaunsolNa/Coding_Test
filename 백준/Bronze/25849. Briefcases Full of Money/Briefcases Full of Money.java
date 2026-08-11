import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long one = Integer.parseInt(st.nextToken());
		long five = Integer.parseInt(st.nextToken()) * 5;
		long ten = Integer.parseInt(st.nextToken()) * 10;
		long twenty = Integer.parseInt(st.nextToken()) * 20;
		long fifty = Integer.parseInt(st.nextToken()) * 50;
		long hundred = Integer.parseInt(st.nextToken()) * 100;

		long max = Math.max(one, Math.max(five, Math.max(ten, Math.max(twenty, Math.max(fifty, hundred)))));
		
		if(hundred == max) {
			System.out.println(100);
			return;
		}
		
		if(fifty == max) {
			System.out.println(50);
			return;
		}
		
		if(twenty == max) {
			System.out.println(20);
			return;
		}
		
		if(ten == max) {
			System.out.println(10);
			return;
		}
		
		if(five == max) {
			System.out.println(5);
			return;
		}
		
		if(one == max) {
			System.out.println(1); 
			return;
		}
		
	}
}
