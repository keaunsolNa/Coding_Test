import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int a = Integer.parseInt(br.readLine());
			System.out.println(a + " " + a);
		}
		
	}
}
