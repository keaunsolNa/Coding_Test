import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int A = 0;
		int B = 0;
		boolean win = false;
		for(int i = 0; i < 9; i++) {
			A += Integer.parseInt(st1.nextToken());
			if(A > B) {
				win = true;
				break;
			}
			B += Integer.parseInt(st2.nextToken());
			
		}
		
		if(win) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
