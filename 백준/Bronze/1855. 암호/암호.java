import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int len = str.length();
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < len / k; j++) {
				sb.append(str.charAt(j % 2 == 0 ? j * k + i : j * k + k - 1 - i));
			}
		}
		
		System.out.println(sb);
	}
}
