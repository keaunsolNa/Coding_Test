import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N < 99) {
			System.out.println(99);
			return;
		} else {
			int i = 0;
			while(true) {
				if((N + i) % 100 == 99) {
					System.out.println(N + i);
					break;
				}
				else if((N - i) % 100 == 99) {
					System.out.println(N - i);
					break;
				}
				
				i++;
			}
		}
		
	}
}
