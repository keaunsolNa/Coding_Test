import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String N = br.readLine().replaceAll("6", "9");
		
		int[] arr = new int[10];
		
		for(int i = 0; i < N.length(); i++) {
			int temp = Character.getNumericValue(N.charAt(i));
			arr[temp]++;
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 9; i++) {
			max = Math.max(arr[i], max);
		}
		
		int nine = arr[9];
		if(nine % 2 == 0) nine /= 2;
		else nine = nine / 2 + 1;
		
		max = Math.max(max, nine);
		
		System.out.println(max);
	}
}
