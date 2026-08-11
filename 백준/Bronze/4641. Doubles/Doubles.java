import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			if(arr[0] == -1) break;
			
			int cnt = 0;
			Arrays.sort(arr);
			
			for(int i = 0; i < arr.length; i++) {
				
				for(int j = i + 1; j < arr.length; j++) {
					
					if(arr[i] * 2 == arr[j]) cnt++;
					if(arr[i] * 2 < arr[j]) break;
				}
			}
			
			System.out.println(cnt);
		}
	}
}
