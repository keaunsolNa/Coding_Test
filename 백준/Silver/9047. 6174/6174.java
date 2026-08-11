import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();

			if(input.equals("6174")) {
				System.out.println(0);
				continue;
			}
			
			int number = solustion(input);
			
			int ans = 1;
			while(number != 6174) {

				ans++;
				input = number+"";
				number = solustion(input);
				
			}
			
			System.out.println(ans);
		}
	}

	public static int solustion(String input) {
	
		Integer[] maxArr = Arrays.stream(Arrays.stream(input.split("")).map(String::trim).mapToInt(Integer::parseInt).toArray()).boxed().toArray(Integer[]::new);
		Integer[] minArr = maxArr.clone();
		
		Arrays.sort(minArr);
		Arrays.sort(maxArr, Collections.reverseOrder());
		
        String max = Arrays.stream(maxArr)
                		   .map(String::valueOf)
                		   .reduce((x, y) -> x + "" + y)
                		   .get();
        
        String min = Arrays.stream(minArr)
        		.map(String::valueOf)
        		.reduce((x, y) -> x + "" + y)
        		.get();
		
		int number = (Integer.parseInt(max) - Integer.parseInt(min));
		return number;
		
	}
}
