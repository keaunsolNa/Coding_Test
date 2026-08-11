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
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = -1;
		
		while((T = Integer.parseInt(br.readLine())) != 0) {
			
			for(int j = 0; j < T; j++) {
				
				int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
				
				int chk = 0;
				char ans = ' ';
				for(int i = 0; i < 5; i++) {
					
					if(arr[i] <= 127) {
						ans = (char)(i + 65);
						chk++;
					}
				}
				
				if(chk == 0 || chk > 1) System.out.println("*");
				else System.out.println(ans);
			}
		}
		
	}
}
