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

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] stringArray = new String[N];
		for(int i = 0; i < N; i++) {
			stringArray[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < stringArray[0].length(); i++) {
			char temp = stringArray[0].charAt(i);
			int cnt = 0;
			for(int j = 1; j < N; j++) {
				if(temp != stringArray[j].charAt(i)) {
					cnt = -1;
				}
			}
			
			if(cnt == -1) {
				sb.append("?");
			} else {
				sb.append(stringArray[0].charAt(i));
			}
		}
		
		System.out.println(sb);
		
	}
}
