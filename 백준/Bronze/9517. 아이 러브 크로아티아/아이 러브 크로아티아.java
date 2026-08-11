import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int totalTime = 210;
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			int time = Integer.parseInt(input.split(" ")[0]);
			String TNP = input.split(" ")[1];
			totalTime -= time;
			
			if(totalTime < 0) break;
			
			if(TNP.equals("T")) {
				
				if(number < 8) number++;
				else number = 1;
				
			}
			
		}
		
		System.out.println(number);
		
	}
}
