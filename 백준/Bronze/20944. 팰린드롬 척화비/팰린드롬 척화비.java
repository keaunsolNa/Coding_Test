import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		if(N%2 == 0) {
			
			for(int i = 0; i < N; i++) {
				sb.append("s");
			}
		} else {
			for(int i = 0; i < N; i++) {
				if(i == N/2) {
					sb.append("t");
				} else {
					sb.append("s");
				}
			}
		}
		
		System.out.println(sb);
	}
}
