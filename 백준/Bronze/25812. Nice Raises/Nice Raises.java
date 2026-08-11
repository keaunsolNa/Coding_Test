import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int t1 = 0;
		int t2 = 0;
		
		while(n --> 0) {
			int money = Integer.parseInt(br.readLine());
			
			int plus = money + r;
			int two = money * 2;
			
			if(plus > two) t1++;
			else if(plus < two) t2++;
		}
		
		if(t1 > t2) System.out.println(1);
		else if(t1 < t2) System.out.println(2);
		else System.out.println(0);
		
	}
}
