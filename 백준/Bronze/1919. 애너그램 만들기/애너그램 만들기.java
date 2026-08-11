import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alp = new int[26];
		char[] A = br.readLine().toCharArray();
		char[] B = br.readLine().toCharArray();
		int sum = 0;
		
		for (char c : A) alp[c - 97]++;
		for (char c : B) alp[c - 97]--;
		
		for(int i = 0; i < alp.length; i++) {
			alp[i] = Math.abs(alp[i]);
			if(alp[i] != 0) sum += alp[i];
		}
		
		System.out.println(sum);
	}
}
