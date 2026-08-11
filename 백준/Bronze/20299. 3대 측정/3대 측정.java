import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		int teamMin = sc.nextInt();
		int perMin = sc.nextInt();

		int[] arr = new int[N * 3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int a = arr[i * 3 + 0];
			int b = arr[i * 3 + 1];
			int c = arr[i * 3 + 2];

			if (a + b + c >= teamMin && a >= perMin && b >= perMin && c >= perMin) {
				cnt++;
				sb.append(a + " ");
				sb.append(b + " ");
				sb.append(c + " ");
			}
		}
		System.out.println(cnt + "\n" + sb);
	}
}
