import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		S = S.replaceAll("[0-9]", "");
		String K = br.readLine();
		
		if(kmp(S, K)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}

	private static boolean kmp(String S, String K) {
		int[] table = makeTable(K);
		
		int n1 = S.length();
		int n2 = K.length();
		
		int idx = 0;
		for(int i = 0; i < n1; i++) {
			while(idx > 0 && S.charAt(i) != K.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(S.charAt(i) == K.charAt(idx)) {
				if(idx == n2 - 1) {
					idx = table[idx];
					return true;
				} else {
					idx++;
				}
			}
		}
		return false;
	}

	private static int[] makeTable(String K) {
		int n = K.length();
		int[] table = new int[n];
		
		int idx = 0;
		for(int i = 1; i < n; i++) {
		
			while(idx > 0 && K.charAt(i) != K.charAt(idx)) {
				idx = table[idx-1];
			}
			
			if(K.charAt(i) == K.charAt(idx)) {
				idx ++;
				table[i] = idx;
			}
		}
		
		return table;
				
	}
}
