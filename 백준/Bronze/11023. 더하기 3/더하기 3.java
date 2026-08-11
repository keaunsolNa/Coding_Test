import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
			
		int sum = 0;
		for(int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		System.out.println(sum);
		
	}
}
