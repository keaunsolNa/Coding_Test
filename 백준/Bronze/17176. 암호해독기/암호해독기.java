import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		char[] cryptogram = new char[N];
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp > 26) cryptogram[i] = ((char)(temp + 70));
			else if(temp > 0) cryptogram[i] = ((char)(temp + 64)) ;
			else cryptogram[i] = ' ';
		}
		
		Arrays.sort(cryptogram);
		
		char[] plainText = br.readLine().toCharArray();
		Arrays.sort(plainText);
		
		for(int i = 0; i < N; i++) {
			if(plainText[i] != cryptogram[i]) {
				System.out.println("n");
				return;
			}
		}
		
		System.out.println("y");
	}
}
