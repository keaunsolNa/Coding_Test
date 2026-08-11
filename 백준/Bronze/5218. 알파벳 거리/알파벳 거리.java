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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i = 0; i < testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb  = new StringBuilder();
			
			String temp1 = st.nextToken();
			String temp2 = st.nextToken();

			sb.append("Distances: ");
			for(int j = 0; j < temp1.length(); j++) {
				int distance = temp2.charAt(j) - temp1.charAt(j);
				if(distance < 0) {
					distance += 26;
				}
				sb.append(distance).append(" ");
			}
		
			System.out.println(sb);
		}
		
	}
}
