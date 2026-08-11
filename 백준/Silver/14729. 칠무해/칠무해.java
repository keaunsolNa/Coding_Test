import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Double[] arr = new Double[7];
		for(int i = 0; i < 7; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i = 7; i < N; i++) {
			
			double temp = Double.parseDouble(br.readLine());
			
			if(temp < arr[6]) {
				arr[6] = temp;
				Arrays.sort(arr);
			}
		}
		
		for (Double double1 : arr) {
			System.out.printf("%.3f", double1);
			System.out.println();
		}
	}
}
