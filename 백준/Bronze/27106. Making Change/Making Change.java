import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		int needCharge = 100 - P;
		int cent1 = needCharge / 25;
		needCharge %= 25;
		int cent2 = needCharge / 10;
		needCharge %= 10;
		int cent3 = needCharge / 5;
		needCharge %= 5;
		int cent4 = needCharge / 1;
		
		System.out.println(cent1 + " " + cent2 +" " + cent3 + " " + cent4);
	}
}
