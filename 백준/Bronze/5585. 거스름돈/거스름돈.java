import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pay = Integer.parseInt(br.readLine());
		
		int charge = 1000-pay;
		int cnt = 0;
		
		if(charge/500 > 0) {
			cnt += charge/500;
			charge %= 500;
		}
		
		if(charge/100 > 0) {
			cnt += charge/100;
			charge %= 100;
		}
		
		if(charge/50 > 0) {
			cnt += charge/50;
			charge %= 50;
		}

		if(charge/10 > 0) {
			cnt += charge/10;
			charge %= 10;
		}
		
		if(charge/5 > 0) {
			cnt += charge/5;
			charge %= 5;
		}
		
		if(charge/1 > 0) {
			cnt += charge/1;
			charge %= 1;
		}
		
		System.out.println(cnt);
	}
}
