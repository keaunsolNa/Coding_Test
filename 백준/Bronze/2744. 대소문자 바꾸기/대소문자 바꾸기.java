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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < temp.length(); i++) {
			if(temp.charAt(i) >= 97 && temp.charAt(i) <= 122) {
				sb.append((char)(temp.charAt(i) - 32));
			} else {
				sb.append((char)(temp.charAt(i) + 32));
			}
		}
		System.out.println(sb);
	}
}
