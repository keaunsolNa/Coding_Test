import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(br.readLine());
		StringBuilder tempStr = new StringBuilder();
		
		while(T --> 0) {
			char[] temp = sb.toString().toCharArray();
			
			int cnt = 1;
			char target = temp[0];
			for(int i = 1; i < temp.length; i++) {
				if(target == temp[i]) {
					cnt++;
				}
				else {
					tempStr.append(cnt).append(target);
					target = temp[i];
					cnt = 1;
				}
			}
			
			tempStr.append(cnt).append(target);
			sb.setLength(0);
			sb.append(tempStr);
			tempStr.setLength(0);
		}
		
		System.out.println(sb);
		
	}
}
