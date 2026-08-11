import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Character[] one = new Character[] {'1', 'Q', 'A', 'Z'};
		Character[] two = new Character[] {'2', 'W', 'S', 'X'};
		Character[] three = new Character[] {'3', 'E', 'D', 'C'};
		Character[] four = new Character[] {'4', '5', 'R', 'T', 'F', 'G', 'V', 'B'};
		Character[] five = new Character[] {'6', '7', 'Y', 'U', 'H' , 'J', 'N', 'M'};
		Character[] six = new Character[] {'8', 'I', 'K', ','};
		Character[] eight = new Character[] {'9', 'O', 'L', '.'};
		
		int[] arr = new int[8];
		for(int i = 0; i < input.length(); i++) {
			
			if(Arrays.asList(one).contains(input.charAt(i))) arr[0]++;
			else if(Arrays.asList(two).contains(input.charAt(i))) arr[1]++;
			else if(Arrays.asList(three).contains(input.charAt(i))) arr[2]++;
			else if(Arrays.asList(four).contains(input.charAt(i))) arr[3]++;
			else if(Arrays.asList(five).contains(input.charAt(i))) arr[4]++;
			else if(Arrays.asList(six).contains(input.charAt(i))) arr[5]++;
			else if(Arrays.asList(eight).contains(input.charAt(i))) arr[6]++;
			else arr[7]++;
		}
		
		for (int i : arr) System.out.println(i);
	}
}
