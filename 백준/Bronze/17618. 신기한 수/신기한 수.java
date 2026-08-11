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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int chk = 0;
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			int j = i;
			sum = 0;
			while (j / 10 > 0) {
				sum = sum + j % 10;
				j = j / 10;
			}
			if (j / 10 == 0) {
				sum = sum + j;
			}
			if (i % sum == 0) chk++;
		}
		
		System.out.println(chk);
		
	}
}
