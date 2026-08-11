import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			int input = Integer.parseInt(br.readLine().replaceAll(" ", ""));
			if(input == -1) break;
			
			int[] speed = new int[input];
			int[] time = new int[input];
			
			for(int i = 0; i < input; i++) {
				st = new StringTokenizer(br.readLine());
				speed[i] = Integer.parseInt(st.nextToken());
				time[i] = Integer.parseInt(st.nextToken());
			}
			
			int total = speed[0] * time[0];
			for(int i = 1; i < input; i++) total += speed[i] * (time[i] - time[i-1]);
			
			System.out.println(total + " miles");
		}
	}
}
