import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int k = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s; i++) {
			int alp = (int)S.charAt(i);
			
			if(alp > 96 && alp < 123) {
				alp += k%26;
				if(alp < 123) {
					sb.append((char)alp);
				} else {
					alp = alp - 26;
					sb.append((char)alp);
				}
			} else if(alp > 64 && alp < 91) {
				alp += k%26;
				if(alp < 91) {
					sb.append((char)alp);
				} else {
					alp = alp - 26;
					sb.append((char)alp);
				}
			} else {
				sb.append((char)alp);
			}
		}
		
		System.out.println(sb);
		
	}
}
