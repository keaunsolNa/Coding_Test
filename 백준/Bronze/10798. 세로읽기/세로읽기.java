import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] charArr = new char[5][15];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 5; i++) {
			charArr[i] = br.readLine().toCharArray();
		}

		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < charArr[j].length) {
					sb.append(charArr[j][i]);
				}
			}
		}
		
		System.out.println(sb);
	}
}
